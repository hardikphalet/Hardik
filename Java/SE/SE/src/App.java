import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.File;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the search term ::  ");
        String srchTrm = scan.nextLine();
        scan.close();
        Crawler crawl = new Crawler(Paths.get("C:/Users/Avadhesh Sharma/Desktop/HardikGit/Java/SE/SE/src/Resources(Test)"));
        searchTerm(srchTrm, crawl);

    }
    public static void searchTerm(String s, Crawler crawl){
        List<Integer> ss = crawl.mapOfWords.get(s);
        for (int i : ss){
            invertMapFile(crawl.mapOfFiles, i);
        }
    }
    public static void invertMapFile(Map<File, Integer> x, int y){
        for (Map.Entry<File, Integer> entry: x.entrySet()){
            if (entry.getValue() == y){
                System.out.println(entry.getKey().getName());
            }
        }
    }
}
