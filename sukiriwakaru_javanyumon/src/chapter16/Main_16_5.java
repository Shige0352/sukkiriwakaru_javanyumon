package chapter16;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_16_5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめまして");
		JLabel label = new JLabel("HELLO World");
		JButton jButton = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(Button);
		frame.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

}
