package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler;

import main.GamePanel;
import main.UtilityTool;

public class Entity {
	// it will store that variables that will be used in player,monster and Npc classes
	GamePanel gp;
	KeyHandler keyH;

    public int worldX;
	public int worldY;
	public int speed;
	
	public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;
	public String direction;

	public int x,y;
	public int solidAreaDefaultX, solidAreaDefaultY;
	public String name;
	public int actionLookCounter = 0;
	public BufferedImage image, image2, image3 ;

	public int maxLife;
	public int life;
	
	public int spriteCounter=0;
	public int spriteNum=1;

	public Rectangle solidArea;
	public boolean collisionOn = false;

	public Entity(GamePanel gp ){
		this.gp = gp;
	}

	public BufferedImage setup(String imagePath){
		UtilityTool uTool = new UtilityTool();
		BufferedImage imageRan = null;
		
		try {
			imageRan = ImageIO.read(getClass().getResourceAsStream(imagePath+".png"));
			imageRan = uTool.scaleImage(imageRan, gp.tileSize, gp.tileSize);
		} catch (Exception e) {
			System.out.println("Okumadı");
		}

		return imageRan;
	}
}
