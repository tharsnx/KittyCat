package main;

import character.Entity;
import java.awt.image.BufferedImage;


public class Background extends Entity{
    public BufferedImage BG,titleScreen,gameover,shop,choos;

    public Background(GamePanel gameP) {
        super(gameP);
        BG = setImage("pic/background/BG");
        titleScreen = setImage("pic/background/titleScreen");
        gameover = setImage("pic/background/gameover");
        shop = setImage("pic/background/shop");
        choos = setImage("pic/background/choos");
        }
    
}
