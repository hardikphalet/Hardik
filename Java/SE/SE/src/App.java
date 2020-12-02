import java.util.Scanner;
import java.nio.file.Paths;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the search term ::  ");
        String srchTrm = scan.nextLine();
        scan.close();
        Crawler crawl = new Crawler(Paths.get("C:/Users/Avadhesh Sharma/Desktop/HardikGit/Java/SE/SE/src/Resources(Test)"));
    }
    public static void searchTerm(String s, Crawler crawl){
        crawl.mapOfWords.get(s);
    }
}
