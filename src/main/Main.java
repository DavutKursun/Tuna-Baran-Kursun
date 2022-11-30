package main;

import javax.swing.JFrame;

public class Main {
//  4 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// This lets the window properly close when user clicks the close ("x") buton		
		
		window.setTitle("2 D Adventure");
		
		GamePanel gamePanel = new GamePanel();// gamePanel is a JPanel with extra functions
		
		window.add(gamePanel);
		window.pack(); 
	    
	    
		window.setLocationRelativeTo(null);// No specify the location of the window(Bunun sayesinde pencere ekranın ortasında çıkacak)
		window.setVisible(true);//its for see the window
		
		gamePanel.startGameThreat();
              
		
		
		
		
	}

}
