public class Scratch{
	
	public static void main(String[] args){
		String s = "12:24:30AM";
		String[] st = s.split(":");
		String zone = st[2];
		zone = zone.substring(2);
		if (zone == AM){
			System.out.println();
		}
		for (String i : st){
			System.out.println(i);
		}
		System.out.println(zone);
	}
}