package main;

import javax.swing.JFrame;

public class main {
	public static void main(String[]args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setTitle("2D Adventure");
		
		gamePanel gamepanel = new gamePanel();
		window.add(gamepanel);
		window.pack();
		
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}

}
