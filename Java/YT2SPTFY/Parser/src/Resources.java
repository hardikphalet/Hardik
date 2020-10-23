import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Resources extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5453425099429315186L;
	private JButton adder;
	
	public Resources(){
		super("YT2SPTFY");
		ButtonClass submitter = new ButtonClass();
		
		adder = new JButton("Add!");
		adder.addActionListener(submitter);
		add(adder);
		
	}
	
	private class ButtonClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("x");   // Remove on deployment 
			try{
				String chromeURL = URLs.getUrl();
				System.out.println(chromeURL);
				URLs.catURL(chromeURL);
			} catch (AWTException d){
				System.out.println("AWTError");
			} catch (InterruptedException d){
				System.out.println("InterruptedException"); //UnsupportedFlavorException, IOException
			} catch(UnsupportedFlavorException d){
				System.out.println("UFE");
			} catch (IOException d){
				
				System.out.println("IOException"); 
			}
		}
	}
}