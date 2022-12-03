package tile;

import java.awt.Graphics2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {
GamePanel gp;
public Tile[] tile;
int mapTileNum[][];
Graphics2D g2 ;
public TileManager(GamePanel gpf) {
	this.gp=gpf;
	tile = new Tile[10];
	mapTileNum= new int[gp.maxScreenCol][gp.maxScreenRow];
	loadMap();
	getTileImage();
	
}
public void getTileImage() {
	try {
		tile[0]=new Tile();
        tile[0].image= ImageIO.read(getClass().getResourceAsStream("/tiles/çim.png"));
       
		tile[1]=new Tile();
		tile[1].image= ImageIO.read(getClass().getResourceAsStream("/tiles/taş.png"));
		tile[1].collision=true;

		tile[2]=new Tile();
		tile[2].image= ImageIO.read(getClass().getResourceAsStream("/tiles/su.png"));
	    tile[2].collision=true;

		tile[3]= new Tile();
		tile[3].image=  ImageIO.read(getClass().getResourceAsStream("/tiles/kum.png")); 
		
		tile[4]= new Tile();
		tile[4].image=  ImageIO.read(getClass().getResourceAsStream("/tiles/ağaç.png")); 
		tile[4].collision=true;

	}catch(IOException e) {
		e.printStackTrace();
	}
}
public void loadMap(){
	try{
InputStream is = getClass().getResourceAsStream("/maps/map1_txt.txt");
BufferedReader br = new BufferedReader(new InputStreamReader(is));


int col = 0;
int row = 0;


while(col<gp.maxScreenCol&& row<gp.maxScreenRow){
	String line = br.readLine();

	while(col<gp.maxScreenCol){
		String numbers[] = line.split(" ");

		int num = Integer.parseInt(numbers[col]);

		mapTileNum[col][row]= num;
		col++;
	}
	if( col == gp.maxScreenCol){
		col = 0;
		row++;
	}
}
	}catch(Exception e){

	}
}
public void draw(Graphics2D g2) {// toplam 17 satır 32 sütun olması gerekiyor

	
	int col =0;
	int row = 0;
	int x =0;
	int y = 0;

	while(col<gp.maxScreenCol&& row < gp.maxScreenRow){

		int tileNum = mapTileNum[col][row];
		g2.drawImage(tile[tileNum].image,x,y,gp.tileSize,gp.tileSize,null);
		col++;
		x+=gp.tileSize;

		if(col == gp.maxScreenCol){
			col=0;
			x=0;
			row++;
			y+= gp.tileSize;
		}
	}
	
	
	
	
	
	
}
}
