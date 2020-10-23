package com.frigga.calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Resources {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea(2,10);
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonres = new JButton();
	
	double number1, number2, result;
	int addc=0, mulc=0, divc=0, subc=0;
	
	public Resources() {
		
		frame.setSize(200,450);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new GridLayout(3,1));
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		panel1.setLayout(new FlowLayout());
		panel1.add(textArea);
		
		textArea.setBackground(Color.black);
		Border tBorder = BorderFactory.createLineBorder(Color.YELLOW,3);
		textArea.setBorder(tBorder);
		Font font = new Font("arial", Font.BOLD,33);
		textArea.setFont(font);
		textArea.setForeground(Color.white);
		
		textArea.setPreferredSize(new Dimension(2, 5));
		textArea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(50,50));
		button1.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\1.png"));
		
		button2.setPreferredSize(new Dimension(50,50));
		button2.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\2.png"));

		button3.setPreferredSize(new Dimension(50,50));
		button3.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\3.png"));
		
		button4.setPreferredSize(new Dimension(50,50));
		button4.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\4.png"));
		
		button5.setPreferredSize(new Dimension(50,50));
		button5.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\5.png"));
		
		button6.setPreferredSize(new Dimension(50,50));
		button6.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\6.png"));
		
		button7.setPreferredSize(new Dimension(50,50));
		button7.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\7.png"));
		
		button8.setPreferredSize(new Dimension(50,50));
		button8.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\8.png"));
		
		button9.setPreferredSize(new Dimension(50,50));
		button9.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\9.png"));
		
		button0.setPreferredSize(new Dimension(50,50));
		button0.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\0.png"));
		
		buttonadd.setPreferredSize(new Dimension(50,50));
		buttonadd.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\sum.png"));
		
		buttonmul.setPreferredSize(new Dimension(50,50));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\mul.png"));
		
		buttonsub.setPreferredSize(new Dimension(50,50));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\sub.png"));
		
		buttondiv.setPreferredSize(new Dimension(50,50));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\div.png"));
		
		buttonclear.setPreferredSize(new Dimension(50,97));
		buttonclear.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\clear.png"));
		
		buttonres.setPreferredSize(new Dimension(50,97));
		buttonres.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\equal.png"));
		
		buttondot.setPreferredSize(new Dimension(50,50));
		buttondot.setIcon(new ImageIcon("C:\\Users\\Avadhesh Sharma\\Desktop\\HardikGit\\Java\\Eclipse\\Calcuator\\src\\com\\frigga\\calc\\Media\\dot.png"));
		
		panel2.setLayout(new GridLayout(5,3));
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(buttonadd);
		panel2.add(button0);
		panel2.add(buttonsub);
		panel2.add(buttonmul);
		panel2.add(buttondiv);
		//panel2.add(buttonclear);
		//panel2.add(buttonres);
		panel2.add(buttondot);
		
		panel3.setLayout(new FlowLayout());
		panel3.add(buttonclear);
		panel3.add(buttonres);
		
		ClickHandle click = new ClickHandle();
		button1.addActionListener(click);
		button2.addActionListener(click);
		button3.addActionListener(click);
		button4.addActionListener(click);
		button5.addActionListener(click);
		button6.addActionListener(click);
		button7.addActionListener(click);
		button8.addActionListener(click);
		button9.addActionListener(click);
		button0.addActionListener(click);
		buttonadd.addActionListener(click);
		buttonsub.addActionListener(click);
		buttonmul.addActionListener(click);
		buttondiv.addActionListener(click);
		buttonclear.addActionListener(click);
		buttonres.addActionListener(click);
		buttondot.addActionListener(click);
		
		
	}
	public double numberReader() {
		double num1;
		String s;
		s = textArea.getText();
		num1 = Double.valueOf(s);
		return num1;
	}
	private class ClickHandle implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == buttonclear) {
				number1 = 0;
				number2 = 0;
				textArea.setText("");
			}
			if (source == button1) {
				textArea.append("1");
			}
			if (source == button2) {
				textArea.append("2");
			}
			if (source == button3) {
				textArea.append("3");
			}
			if (source == button4) {
				textArea.append("4");
			}
			if (source == button5) {
				textArea.append("5");
			}
			if (source == button6) {
				textArea.append("6");
			}
			if (source == button7) {
				textArea.append("7");
			}
			if (source == button8) {
				textArea.append("8");
			}
			if (source == button9) {
				textArea.append("9");
			}
			if (source == button0) {
				textArea.append("0");
			}
			if (source == buttondot) {
				textArea.append(".");
			}
			if (source == buttonadd) {
				number1 = numberReader();
				textArea.setText("+");
				addc = 1;
				divc = 0;
				subc = 0;
				mulc = 0; 
			}
			if (source == buttondiv) {
				number1 = numberReader();
				textArea.setText("/");
				addc = 0;
				divc = 1;
				subc = 0;
				mulc = 0; 
			}
			if (source == buttonsub) {
				number1 = numberReader();
				textArea.setText("-");
				addc = 0;
				divc = 0;
				subc = 1;
				mulc = 0; 
			}
			if (source == buttonmul) {
				number1 = numberReader();
				textArea.setText("*");
				addc = 0;
				divc = 0;
				subc = 0;
				mulc = 1; 
			}
			if (source == buttonres) {
				number2 = numberReader();
				if (addc > 0) {
					result = number1 + number2;
					textArea.setText(Double.toString(result));
				}
				if (subc > 0) {
					result = number1 - number2;
					textArea.setText(Double.toString(result));
				}
				if (mulc > 0) {
					result = number1 * number2;
					textArea.setText(Double.toString(result));
				}
				if (divc > 0) {
					result = number1 / number2;
					textArea.setText(Double.toString(result));
				}
			}
			
			
		}
	}
	
}
