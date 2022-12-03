package main;
import entity.Player;
import tile.TileManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements Runnable{
	// screen settings
	final int originalTileSize = 16; //16x16 tile
	final int scale =3;   
	
	public final int tileSize = originalTileSize * scale; //16x3=48 pixel
	final int maxScreenCol = 32;
	final int maxScreenRow = 17;
	final int screenWidth = tileSize * maxScreenCol; //768 pixel // uptaded for my pc resolution
	final int screenHeight = tileSize * maxScreenRow;//576 pixels //  uptaded for my pc resolution
	
	TileManager tileM = new TileManager(this);
	KeyHandler keyH= new KeyHandler();
	Thread gameThread;
	Player player = new Player(this,keyH);
	public CollisionChecker cChaecker = new CollisionChecker(this);
	int FPS = 60;//fps

	//constructor
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
        this.setDoubleBuffered(true);// If set to true, all the drawing from this component will be done in an offscreen painting buffer.	
	    //In short, enabling this can improve game's rendering performance
        this.addKeyListener(keyH);
        this.setFocusable(true);// with this, this GamePanel can be Focused to receive key input.
	}

	public void startGameThreat() {//a java library feature that allows us to simultaneously press keys and update the image at the same time
		gameThread = new Thread(this);// 
		gameThread.start();
	}	
	@Override
	public void run() {
		// delta method for visible movements(eğer bu metodu yazmasaydım hareket etme tuşuna basar basmaz karakter milyonlarca piksel ilerlediği için ekrandan çıkıp kaybolurdu)
		
		double drawInterval = 1000000000/FPS;// draws a screen 0.01666 persecond
		double delta = 0;
		long startingTime = System.nanoTime();
		long currentTime;
		 //System.nanoTime nanoSaniyeler olarak zamanı günceller 1 milyar nanosaniye = 1 saniye 
		
		System.out.println(startingTime);
		while(gameThread != null) {
		     
			currentTime = System.nanoTime();
			
			
			delta += (currentTime - startingTime)/ drawInterval; //currentTime - startingTime bize ne kadar zaman geçtiğini gösteriyor.
			
			startingTime=currentTime;
			
			
			
			
			if(delta>=1) {
				
			// 1 Update : update information such as character positions
			    update();
			// 2 Draw : draw the screen with the updated information
		        repaint();                  
		     delta--;   
			}
		   
		}
		
	                  }
	public void update() {
	player.upDate();
	}
	public void paintComponent(Graphics g) {// Graphics is a class that has many functions to draw object on screen.
		super.paintComponent(g);    //!SOR!
		Graphics2D g2 = (Graphics2D)g;// we want to use some caracterictics in Graphics2D
		
	
		tileM.draw(g2);
		player.draw(g2);
		g2.dispose();   // program will work without it but it will save some memories
	}
	
	
}
