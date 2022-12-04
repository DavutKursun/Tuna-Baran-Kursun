package object;

import java.awt.image.BufferedImage;

import main.GamePanel;

import java.awt.Rectangle;
import java.awt.Graphics2D;

/**
 * SuperObject
 */
public class SuperObject {

    public BufferedImage image, image2, image3 ;
    public String name;
    public boolean collission = false;
    public int worldX, worldY;
    public Rectangle solidArea ;

    
}