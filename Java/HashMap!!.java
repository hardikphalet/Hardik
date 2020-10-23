import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Scratch {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()){
            return false;
        }
        
        a.toLowerCase();
        b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < b.length(); k++){
            char letter = b.charAt(k);

            if (! map.containsKey(letter)){
                map.put(letter, 1);
            } else {
                int freq = map.get(letter);
                map.put(letter, ++freq);
            }
        }

        for (int k = 0; k < a.length(); k++){
            char letter = a.charAt(k);

            if (! map.containsKey(letter)){
                return false;
            }

            int freq = map.get(letter);

            if (freq == 0){
                return false;
            } else{
                map.put(letter, --freq);
            }
        }
		return true;

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
