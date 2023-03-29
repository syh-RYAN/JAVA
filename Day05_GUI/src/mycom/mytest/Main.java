package mycom.mytest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		Color bgcolor = new Color(195,200,234);
		
		f.setBackground(bgcolor);
		
		Button btn = new Button("로그인");
		btn.setSize(150, 150);
		f.add(btn);
		

		f.setSize(800, 600);
		f.setVisible(true);

	}
};
