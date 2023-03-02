package character;

import main.GamePanel;
import main.KeyHandler;
import java.util.*;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cat extends Entity implements ActionListener{

    Graphics2D g2;
    public int score = 0;
    public int clawSpeed = 6;
    public int xClaw = 60;
    public int yClaw = 440;
    public int Shot = 0;
    public final int startShot = 1;
    public final int stopShot = 0;
    public int[] canP = {1,0,0};
    BufferedImage faceCat;
    String nameCat;
    int skin;
    Random random = new Random();
    Font Thars;

    // Damage

    public Cat(GamePanel gameP, KeyHandler keyHL) {
        super(gameP);
        this.keyHL = keyHL;
        Thars = new Font("Arial",Font.PLAIN,20);
        setDefaultValues();
    }

    public void setDefaultValues() {
        x = 25;
        y = 440;
        speed = 4;

    }

    public void setSkin(int n) {
        skin = n;
    }

    public void setCatImage() {
        // skin = 1+random.nextInt(3);
        if(skin == 1){
            movement1 = setImage("pic/cat/sprite_0");
            movement2 = setImage("pic/cat/sprite_1");
            movement3 = setImage("pic/cat/sprite_2");
            claw = setImage("pic/talon/claw_2");
            faceCat = setImage("pic/faceCat/g");
            nameCat = "LUCKY";
        }
        if(skin == 2 && canP[1]==1){
            movement1 = setImage("pic/cat/sprite_03");
            movement2 = setImage("pic/cat/sprite_04");
            movement3 = setImage("pic/cat/sprite_05");
            claw = setImage("pic/talon/claw_3");
            faceCat = setImage("pic/faceCat/o");
            nameCat = "GARFIELD";
        }
        if(skin == 3 && canP[2]==1){
            movement1 = setImage("pic/cat/sprite_06");
            movement2 = setImage("pic/cat/sprite_07");
            movement3 = setImage("pic/cat/sprite_08");
            claw = setImage("pic/talon/claw_1");
            faceCat = setImage("pic/faceCat/w");
            nameCat = "KITTY";
        }
        

}

    public void update() {
        if(gameP.gameState == gameP.startGame){
            if (keyHL.upPress == true && y > 208) {

                y -= speed;
            } else if (keyHL.downPress == true && y<700) {
    
                y += speed;
            }
        }
        else if(gameP.gameState == gameP.stopGame){
            // ui.darw(null);
        }
        spriteCounter++;
        if (spriteCounter > 10) {
            if (spriteNum == 1) {
                spriteNum = 2;
            }
            else if (spriteNum == 2) {
                spriteNum = 3;
            }
            else if (spriteNum == 3) {
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
    }

    public void draw(Graphics2D g2) {
        setCatImage();

        BufferedImage image = null;
        if(gameP.gameState == gameP.startGame){
            if (spriteNum == 1)
                image = movement1;
            else if (spriteNum == 2)
                image = movement2;
            else if (spriteNum == 3)
                image = movement3;
            score +=1;
        }
        else if(gameP.gameState == gameP.stopGame){
            image = movement1;
        }
        else{

        }
        g2.drawImage(claw, xClaw, yClaw, (int)((gameP.originalTileSize)*2), (int)((gameP.originalTileSize)*2), null);
        g2.drawImage(image, 25, y, (int)((gameP.originalTileSize)*2.5), (int)((gameP.originalTileSize)*2.5), null);
        g2.drawImage(faceCat,25,2,60,60,null);
        g2.setColor(Color.white);
        g2.setFont(Thars);
        g2.drawString(nameCat,100,45);
        g2.drawString("SCORE "+score+" m", 1100, 35);
        // System.out.println(score);
        if(score % 30000 == 0 && score > 1 && speed < 10){
            speed +=1;
        }
    }

    public void movement(GamePanel gameP) {
        actionPerformed(null);
        // gameP.startGameThread();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        xClaw += clawSpeed;
        gameP.repaint();
        if(xClaw > 1370){
            xClaw = 60;
            yClaw = y;
        }
        if(xClaw < 60){
            yClaw = y;
            clawSpeed = 1;
        }
        else {
            clawSpeed = 6;
        }
    }

    public void upClawSpeed(){
        clawSpeed++;
        gameP.hit.numCoins -= 150;
    }
}
