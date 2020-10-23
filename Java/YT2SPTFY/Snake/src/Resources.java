import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Resources extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3351132076963244662L;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonPlus;
	private JButton buttonSub;
	private JTextField window;
	
	
	public Resources() {
		this.setLayout(new GridLayout(4,3));
		
		ButtonClass submitter = new ButtonClass();
		
		button1 = new JButton("1");
		add(button1);
		button1.addActionListener(submitter);
		
		button2 = new JButton("2");
		add(button2);
		button2.addActionListener(submitter);

		button3 = new JButton("3");
		add(button3);
		button3.addActionListener(submitter);
		
		button4 = new JButton("4");
		add(button4);
		button4.addActionListener(submitter);
		
		button5 = new JButton("5");
		add(button5);
		button5.addActionListener(submitter);
		
		button6 = new JButton("6");
		add(button6);
		button6.addActionListener(submitter);
		
		button7 = new JButton("7");
		add(button7);
		button7.addActionListener(submitter);
		
		button8 = new JButton("8");
		add(button8);
		button8.addActionListener(submitter);

		button9 = new JButton("9");
		add(button9);
		button9.addActionListener(submitter);
		
		buttonPlus = new JButton("+");
		add(buttonPlus);
		buttonPlus.addActionListener(submitter);
		
		button0 = new JButton("0");
		add(button0);
		button0.addActionListener(submitter);
		
		buttonSub = new JButton("-");
		add(buttonSub);
		buttonSub.addActionListener(submitter);
		
		
	}
	
	private class ButtonClass implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.out.println("x");
			
		}
		
	}
	
}
