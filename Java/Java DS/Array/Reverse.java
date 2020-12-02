public class Reverse {
	private static String mulSI(String s, int x){
        String res = "";
			for (int i = 0; i < x; i++){
				res += s;
			}
        return res;
    }
    static void staircase(int n) {
        for (int i = 0; i < n; i++){
			String tempRes = "";
            for (int j = 0; j < 1; j++){
                tempRes += mulSI(" ", n-i-1);
                tempRes += mulSI("#", i+1);
            }
            System.out.println(tempRes);
        }
    }
	public static void main(String... args){
		int inp = 5;
		staircase(inp);
	}
}