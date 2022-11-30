package tile;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {
GamePanel gp;
Tile[] tile;

public TileManager(GamePanel gpf) {
	this.gp=gpf;
	tile = new Tile[10];
	getTileImage();
}
public void getTileImage() {
	try {
		tile[0]=new Tile();
tile[0].image= ImageIO.read(getClass().getResourceAsStream("/tiles/çim.png"));
        tile[1]=new Tile();
tile[1].image= ImageIO.read(getClass().getResourceAsStream("/tiles/taş.png"));
        tile[2]=new Tile();
tile[2].image= ImageIO.read(getClass().getResourceAsStream("/tiles/su.png"));
	
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public void draw(Graphics2D g2) {
	g2.drawImage(tile[1].image,0,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,48,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,192,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,288,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,336,0,gp.tileSize,gp.tileSize,null);                //1. satır
	g2.drawImage(tile[1].image,384,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,480,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,528,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,624,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,672,0,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,0,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,48,gp.tileSize,gp.tileSize,null);                //2. satır
	g2.drawImage(tile[0].image,384,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,48,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,48,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,96,gp.tileSize,gp.tileSize,null);                //3. satır
	g2.drawImage(tile[0].image,384,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,96,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,96,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,144,gp.tileSize,gp.tileSize,null);                //4. satır
	g2.drawImage(tile[0].image,384,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,144,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,144,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,192,gp.tileSize,gp.tileSize,null);                //5. satır
	g2.drawImage(tile[0].image,384,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,192,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,192,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,240,gp.tileSize,gp.tileSize,null);                //6. satır
	g2.drawImage(tile[0].image,384,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,240,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,240,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,288,gp.tileSize,gp.tileSize,null);                //7. satır
	g2.drawImage(tile[0].image,384,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,288,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,288,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,336,gp.tileSize,gp.tileSize,null);                //8. satır
	g2.drawImage(tile[0].image,384,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,336,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,336,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,384,gp.tileSize,gp.tileSize,null);                //9. satır
	g2.drawImage(tile[0].image,384,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,384,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,384,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,432,gp.tileSize,gp.tileSize,null);                //10. satır
	g2.drawImage(tile[0].image,384,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,432,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,432,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,480,gp.tileSize,gp.tileSize,null);                
	g2.drawImage(tile[0].image,384,480,gp.tileSize,gp.tileSize,null); //11. satır
	g2.drawImage(tile[0].image,432,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,528,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,+672,480,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,480,gp.tileSize,gp.tileSize,null);
	
	g2.drawImage(tile[0].image,0,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,48,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,96,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,144,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,192,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,240,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,288,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,336,528,gp.tileSize,gp.tileSize,null);               
	g2.drawImage(tile[0].image,384,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,432,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[0].image,480,528,gp.tileSize,gp.tileSize,null);//12. satır
	g2.drawImage(tile[1].image,528,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,576,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[1].image,624,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,672,528,gp.tileSize,gp.tileSize,null);
	g2.drawImage(tile[2].image,720,528,gp.tileSize,gp.tileSize,null);
	
	
	
	
	
	
	
	
	
	
}
}
