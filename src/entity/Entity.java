package entity;

import java.awt.image.BufferedImage;

public class Entity {
// it will store that variables that will be used in player,monster and Npc classes.
	public int x,y;
	public int speed;
	
	public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;
	public String direction;
	
	public int spriteCounter=0;
	public int spriteNum=1;
}
