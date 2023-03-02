package character;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.Rectangle;
import main.GamePanel;
import main.KeyHandler;

public class Entity {

    protected GamePanel gameP;
    KeyHandler keyHL;

    public Entity(GamePanel gameP) {
        this.gameP = gameP;
    }

    public int x, y;
    // public int score = 0;
    public Rectangle solidArea = new Rectangle(0,0,48,48);
    public BufferedImage movement1, movement2, movement3;
    public BufferedImage dog1,dog2,dog3;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;
    // public Ui ui = new Ui(gameP);

    // public Dog dog = new Dog(gameP);
    public String name;
    public int maxLife;
    public int life;
    public int attack;
    public int speed;
    public boolean alive;
    public int Wx;
    public int Wy;

    // Item
    public int useCost;
    public BufferedImage claw;


    public BufferedImage setImage(String nameImage) {

        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(nameImage+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}
