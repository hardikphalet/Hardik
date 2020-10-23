import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.DataFlavor;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;

public class URLs {
	public static String getUrl()throws AWTException, InterruptedException, UnsupportedFlavorException, IOException {
		Thread.sleep(300);
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ALT);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(200);
		rob.keyRelease(KeyEvent.VK_ALT);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(200);
		rob.keyPress(KeyEvent.VK_D);
		rob.keyRelease(KeyEvent.VK_ALT);
		rob.keyRelease(KeyEvent.VK_D);
		rob.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(200);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
		
		String selectedText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		return selectedText;
		
	}
	public static void catURL(String x) throws IOException, MalformedURLException{
		URL url = new URL(x);
		Scanner scan = new Scanner (url.openStream());
		StringBuffer sb = new StringBuffer();
		while (scan.hasNext()){
			sb.append(scan.next());
		}
		String result = sb.toString();
		System.out.println("xx");
		System.out.println(result);
	}
	
}