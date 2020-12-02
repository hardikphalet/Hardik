import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.nio.file.Path;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.HashSet;

public class Crawler {
    private List<Path> sources;
    public Map<File, Integer> mapOfFiles;
    public Map<String, List<Integer>> mapOfWords;

    public Crawler(Path home) throws IOException {
        try {
            sources = listSourceFiles(home);
        } catch (IOException err) {
            err.getCause();
        }
        mapOfFiles = fileIndex(sources);
        mapOfWords = new HashMap<>();
        wordIndex(sources, mapOfWords, mapOfFiles);
    }
    private List<Path> listSourceFiles(Path dir) throws IOException{
        List<Path> res = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir,"*.{txt}")){
            for (Path entry: stream){
                res.add(entry);
            }
        } catch(DirectoryIteratorException err){
            throw err.getCause();
        }
        return res;
    }
    private Map<File, Integer> fileIndex(List<Path> x){
        Map<File, Integer> res = new HashMap<>();
        for (int i = 0; i < x.size(); i++){
            res.put(x.get(i).toFile(),Integer.valueOf(i));
        }
        return res;
    }
    private void wordIndex(List<Path> x, Map<String, List<Integer>> y, Map<File, Integer> z) throws IOException {
        for (Path p : x){
            int i = z.get(p.toFile());
            String data = "";
            data = new String(Files.readAllBytes(p));
            Set<String> unique = new HashSet<String>(Arrays.asList(data.toLowerCase().split("[-.,:;?!~\\s]+")));
            for (String s : unique){
                if (y != null && y.containsKey(s)){
                    List<Integer> tempList = y.get(s);
                    tempList.add(i);
                    y.put(s,tempList);
                } else{
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(Integer.valueOf(i));
                    y.put(s,tempList);
                }
            }
        }

    }
}
