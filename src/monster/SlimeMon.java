package monster;

import java.util.Random;

import entity.Entity;
import main.GamePanel;


public class SlimeMon extends Entity{
    

    public SlimeMon(GamePanel gp){
        super(gp);

        name = "Slime Monster";
        speed = 1 ;
        maxLife = 4;
        life = maxLife;

        solidArea.x = 3;
        solidArea.y = 10;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

		getImage();
    }

    public void getImage (){

            up1=setup("/player/p_up1.png");
			up2=setup("/player/p_up2.png");
			down1=setup("/player/p_down1.png");
			down2=setup("/player/p_down2.png");   //bu metod playerin her yönü için 2 şer resim içeriyor 
			left1=setup("/player/p_left1.png");   //2 resmin olma sebebi ise bir yönde ilerlerken resimleri sıra
			left2=setup("/player/p_left2.png");   //değiştirerek animasyon yaratmak
			right1=setup("/player/p_right1.png");
			right2=setup("/player/p_right2.png");
    }
    
    public void setAction() {
		actionLookCounter++;

		if(actionLookCounter == 120){
			Random random = new Random();
			int i = random.nextInt(100) + 1 ;
			if(i <= 25) {
				direction = "up";
			}
			if(i > 25 && i <= 50) {
				direction = "down";
			}
			if(i > 50 && i <= 75) {
				direction = "left";
			}
			if(i > 75 && i <= 100) {
				direction = "right";
			}

			actionLookCounter = 0;
		}
	}
}
