package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity {
          
	  GamePanel gp;
	  KeyHandler keyH;
	  
	  //constructor
	  public Player(GamePanel gp,KeyHandler keyH) {
		  this.gp=gp;
		  this.keyH=keyH;
		  
		  setDefoultValues();
		  getPlayerImage();
	  }
	public void setDefoultValues() {
		x=100;
		y=100;
		speed = 3;
		direction = "up";
	}
	public void getPlayerImage() {
		try {
			up1=ImageIO.read(getClass().getResourceAsStream("/player/p_up1.png"));
			up2=ImageIO.read(getClass().getResourceAsStream("/player/p_up2.png"));
			down1=ImageIO.read(getClass().getResourceAsStream("/player/p_down1.png"));
			down2=ImageIO.read(getClass().getResourceAsStream("/player/p_down2.png"));   //bu metod playerin her yönü için 2 şer resim içeriyor 
			left1=ImageIO.read(getClass().getResourceAsStream("/player/p_left1.png"));   //2 resmin olma sebebi ise bir yönde ilerlerken resimleri sıra
			left2=ImageIO.read(getClass().getResourceAsStream("/player/p_left2.png"));   //değiştirerek animasyon yaratmak
			right1=ImageIO.read(getClass().getResourceAsStream("/player/p_right1.png"));
			right2=ImageIO.read(getClass().getResourceAsStream("/player/p_right2.png"));
		}catch(IOException e) {
		e.printStackTrace();
		}
	}
	public void upDate() {// update metodu oyunun asıl işlemlerinin gerçekleştiği yer(konum güncellemesi sağlık barı güncellemesi vs.)
	if(keyH.upPressed==true||keyH.downPressed==true||keyH.leftPressed==true||keyH.rightPressed==true) {//bu if cümlesi bir tuşa basmadığımız zaman ana karakterin durmasını sağlıyor
		// bir tuşa basmayınca elbette hareket etmeyecek fakat olduğu yerde aynı directionun resimleri arasında sürekli geçiş yapacağı için kötü bir görüntü oluşturacak
		if(keyH.upPressed==true) {
			y -= speed;
			direction="up";
		}
		else if(keyH.downPressed==true) {
			y += speed;
			direction="down";
		}
		else if(keyH.leftPressed==true) {
			x-=speed;
			direction = "left";
		}
		else if(keyH.rightPressed==true) {
			x+=speed;
			direction = "right";
		}
		
		spriteCounter++;
		
		if(spriteCounter>10) {
			if(spriteNum==1) {
				spriteNum=2;
			}
			else if(spriteNum==2) {
			spriteNum=1;	
			}
			spriteCounter=0;
		}
	}
	}
	public void draw(Graphics2D g2) { // draw metodunun özelliği ise loopun içinde uptadeden gelen bilgileri ekrana dökmesi
      //  g2.setColor(Color.white); bunla anlatmk için
      //g2.fillRect( x , y , gp.tileSize, gp.tileSize); //3.ve 4. oyuncuyu çiziyor 1 ve 2 ise oyuncunun konumu
		BufferedImage image = null;
		switch(direction) {
		case"up":
			if(spriteNum==1) {
				image=up1;	
			}
			if(spriteNum==2) {
				image=up2;	
			}
			break;
		case"down":
			if(spriteNum==1) {
				image=down1;	
			}
			if(spriteNum==2) {
				image=down2;
			}
			break;
		case"left":
			if(spriteNum==1) {
				image=left1;	
			}
			if(spriteNum==2) {
				image=left2;
			}
			break;
		case "right":
			if(spriteNum==1) {
				image=right1;	
			}
			if(spriteNum==2) {
				image=right2;
			}
			 break;
			 	}
		g2.drawImage(image,x,y,gp.tileSize*5,gp.tileSize*5,null);//spnuncusu image observer ne işe yarıyor sor
	}
}
