package character;

import main.GamePanel;
import java.awt.Graphics2D;
import java.lang.Math;
import java.util.*;
import java.awt.image.BufferedImage;
import main.KeyHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dog extends Entity implements ActionListener {
    KeyHandler keyHL;
    public int x1,x2,x3,x4,x5,x6,x7,x8;
    public int width, height;
    public int y1,y2,y3,y4;
    public int y5,y6,y7,y8;
    public int gameSpeed = 3;
    public BufferedImage image1,image2,image3,image4;
    public BufferedImage image5,image6,image7,image8;
    Random random = new Random();
    BufferedImage[]dogs = setImage();
    final int[] X1list = {1360, 1440, 1400, 1380, 1480};
    final int[] X2list = {2040, 2000, 2080, 2100, 2120};
    final int[] Ylist = {208, 320, 432, 544, 656};
    // Cat cat;

    public Dog(GamePanel gameP) {
        super(gameP);
        // cat = new Cat(gameP, keyHL);
        // random X
        this.x1 = X1list[random.nextInt(5)];
        this.x2 = X1list[random.nextInt(5)];
        this.x3 = X1list[random.nextInt(5)];
        this.x4 = X1list[random.nextInt(5)];
        this.x5 = X2list[random.nextInt(5)];
        this.x6 = X2list[random.nextInt(5)];
        this.x7 = X2list[random.nextInt(5)];
        this.x8 = X2list[random.nextInt(5)];

        // random Y1
        this.y1 = Ylist[random.nextInt(5)];
        this.y2 = Ylist[random.nextInt(5)];
        if((Math.abs(x2 - x1) <= 136) || (Math.abs(x2 - x3) <= 136) || (Math.abs(x2 - x4) <= 136)){
            y2 = -97;
            x2 = -97;
        }
        this.y3 = Ylist[random.nextInt(5)];
        if((Math.abs(x3 - x1) <= 136) || (Math.abs(x3 - x2) <= 136) || (Math.abs(x3 - x4) <= 136)){
            y3 = -97;
        }
        this.y4 = Ylist[random.nextInt(5)];
        if((Math.abs(x4 - x1) <= 136) || (Math.abs(x4 - x2) <= 136) || (Math.abs(x4 - x3) <= 136)){
            y4 = -97;
        }

        y5 = Ylist[random.nextInt(5)];
        y6 = Ylist[random.nextInt(5)];
        if((Math.abs(x6 - x5) <= 136) || Math.abs(x6 - x7) <= 136 || Math.abs(x6 - x8) <= 136){
            y6 = -97;
        }
        y7 = Ylist[random.nextInt(5)];
        if(Math.abs(x7 - x5) <= 136 || Math.abs(x7 - x6) <= 136 || Math.abs(x7 - x8) <= 136){
            y7 = -97;
        }
        y8 = Ylist[random.nextInt(5)];
        if(Math.abs(x8 - x5) <= 136 || Math.abs(x8 - x6) <= 136 || Math.abs(x8 - x7) <= 136){
            y8 = -97;
        }
        this.width = gameP.tileSize;
        this.height = gameP.tileSize;
        this.image1 = dogs[random.nextInt(3)];
        this.image2 = dogs[random.nextInt(3)];
        this.image3 = dogs[random.nextInt(3)];
        this.image4 = dogs[random.nextInt(3)];
        this.image5 = dogs[random.nextInt(3)];
        this.image6 = dogs[random.nextInt(3)];
        this.image7 = dogs[random.nextInt(3)];
        this.image8 = dogs[random.nextInt(3)];
        movement(gameP);
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(image1, x1,y1, width, height, null);
        g2.drawImage(image2, x2,y2, width, height, null);
        g2.drawImage(image3, x3,y3, width, height, null);
        g2.drawImage(image4, x4,y4, width, height, null);
        /////////////////////////////////////////////////////////////////
        g2.drawImage(image5, x5,y5, width, height, null);
        g2.drawImage(image6, x6,y6, width, height, null);
        g2.drawImage(image7, x7,y7, width, height, null);
        g2.drawImage(image8, x8,y8, width, height, null);
    }

    public void updateSpeed(int score){
        if(score % 10000 == 0 && score > 1 && gameSpeed < 10){
            gameSpeed +=1;
        }
    }

    private BufferedImage[] setImage() {
        dog1 = setImage("pic/dog/dog1");
        dog2 = setImage("pic/dog/dog2");
        dog3 = setImage("pic/dog/dog3");
        BufferedImage[] Dogs = { dog1, dog2, dog3 };
        return Dogs;
    }

    public void movement(GamePanel gameP) {
        actionPerformed(null);
        // gameP.startGameThread();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x1 -= gameSpeed;
        x2 -= gameSpeed;
        x3 -= gameSpeed;
        x4 -= gameSpeed;
        x5 -= gameSpeed;
        x6 -= gameSpeed;
        x7 -= gameSpeed;
        x8 -= gameSpeed;
        gameP.repaint();
        //////////////////////////////////////
        if (x1 < -96){
            x1 = X1list[random.nextInt(5)];
            y1 = Ylist[random.nextInt(5)];
            if(Math.abs(x1 - x2) <= 136 || Math.abs(x1 - x3) <= 136 || Math.abs(x1 - x4) <= 136 || Math.abs(x1 - x5) <= 136 || Math.abs(x1 - x6) <= 136 || Math.abs(x1 - x7) <= 136 || Math.abs(x1 - x8) <= 136){
                y1 = -97;
                x1 = -97;
            }
            image1 = dogs[random.nextInt(3)];
        }
        if (x2 < -96){
            x2 = X1list[random.nextInt(5)];
            y2 = Ylist[random.nextInt(5)];
            if(Math.abs(x2 - x1) <= 136 || Math.abs(x2 - x3) <= 136 || Math.abs(x2 - x4) <= 136 || Math.abs(x2 - x5) <= 136 || Math.abs(x2 - x6) <= 136 || Math.abs(x2 - x7) <= 136 || Math.abs(x2 - x8) <= 136){
                y2 = -97;
                x2 = -97;
            }
            image2 = dogs[random.nextInt(3)];
        }
        if (x3 < -96){
            x3 = X1list[random.nextInt(5)];
            y3 = Ylist[random.nextInt(5)];
            if(Math.abs(x3 - x1) <= 136 || Math.abs(x3 - x2) <= 136 || Math.abs(x3 - x4) <= 136 || Math.abs(x3 - x5) <= 136 || Math.abs(x3 - x6) <= 136 || Math.abs(x3 - x7) <= 136 || Math.abs(x3 - x8) <= 136){
                y3 = -97;
                x3 = -97;
            }
            image3 = dogs[random.nextInt(3)];
        }
        if (x4 < -96){
            x4 = X1list[random.nextInt(5)];
            y4 = Ylist[random.nextInt(5)];
            if(Math.abs(x4 - x1) <= 136 || Math.abs(x4 - x2) <= 136 || Math.abs(x4 - x3) <= 136 || Math.abs(x4 - x5) <= 136 || Math.abs(x4 - x6) <= 136 || Math.abs(x4 - x7) <= 136 || Math.abs(x4 - x8) <= 136){
                y4 = -97;
                x4 = -97;
            }
            image4 = dogs[random.nextInt(3)];
        }
        if (x5 < -96){
            x5 = X1list[random.nextInt(5)];
            y5 = Ylist[random.nextInt(5)];
            if(Math.abs(x5 - x1) <= 136 || Math.abs(x5 - x2) <= 136 || Math.abs(x5 - x3) <= 136 || Math.abs(x5 - x4) <= 136 || Math.abs(x5 - x6) <= 136 || Math.abs(x5 - x7) <= 136 || Math.abs(x5 - x8) <= 136){
                y5 = -97;
                x5 = -97;
            }
            image5 = dogs[random.nextInt(3)];
        }
        if (x6 < -96){
            x6 = X1list[random.nextInt(5)];
            y6 = Ylist[random.nextInt(5)];
            if(Math.abs(x6 - x1) <= 136 || Math.abs(x6 - x2) <= 136 || Math.abs(x6 - x3) <= 136 || Math.abs(x6 - x4) <= 136 || Math.abs(x6 - x5) <= 136 || Math.abs(x6 - x7) <= 136 || Math.abs(x6 - x8) <= 136){
                y6 = -97;
                x6 = -97;
            }
            image6 = dogs[random.nextInt(3)];
        }
        if (x7 < -96){
            x7 = X1list[random.nextInt(5)];
            y7 = Ylist[random.nextInt(5)];
            if(Math.abs(x7 - x1) <= 136 || Math.abs(x7 - x2) <= 136 || Math.abs(x7 - x3) <= 136 || Math.abs(x7 - x4) <= 136 || Math.abs(x7 - x5) <= 136 || Math.abs(x7 - x6) <= 136 || Math.abs(x7 - x8) <= 136){
                y7 = -97;
                x7 = -97;
            }
            image7 = dogs[random.nextInt(3)];
        }
        if (x8 < -96){
            x8 = X1list[random.nextInt(5)];
            y8 = Ylist[random.nextInt(5)];
            if(Math.abs(x8 - x1) <= 136 || Math.abs(x8 - x2) <= 136 || Math.abs(x8 - x3) <= 136 || Math.abs(x8 - x4) <= 136 || Math.abs(x8 - x5) <= 136 || Math.abs(x8 - x6) <= 136 || Math.abs(x8 - x7) <= 136){
                y8 = -97;
                x8 = -97;
            }
            image8 = dogs[random.nextInt(3)];
        }
    }

}