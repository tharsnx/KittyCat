package main;

import java.awt.*;
import java.util.*;

import javax.swing.JPanel;

import action.AFK;
import action.Hit;
import action.Object;
import character.*;

public class GamePanel extends JPanel implements Runnable { // this class inherites JPanel class

    // screen settings
    Random random = new Random();
    public final int originalTileSize = 32; // 32*32 tile of size of character
    final int scale = 3; // ตัวกำหนดว่าขนาดตัวละครจะเพื่มกี่เท่า

    public final int tileSize = originalTileSize * scale; // ขนาดในหน้าจอ
    final int maxScreenColum = 16; // 4
    final int maxScreenRow = 12; // 3
    final int screenWidth = 1360;
    final int screenHeight = 768;

    // FPS
    int FPS = 60;

    // STSTEMS
    KeyHandler keyH = new KeyHandler(this);
    Ui ui = new Ui(this);
    public Sound sound;
    Thread gameThread;
    Graphics2D g2;

    // CHARACTER AND OBJECT
    public Cat cat = new Cat(this, keyH);
    public Dog dog = new Dog(this);
    public Hit hit = new Hit(this);
    public AFK afk = new AFK(this,keyH);
    public Background BG = new Background(this);
    public Object object = new Object(this);
    int skins;


    // GAMESTATES
    public int gameState;
    public final int lobbyGame = 0;
    public final int startGame = 1;
    public final int stopGame = 2;
    public final int endGame = 3;
    public final int chooseSkin = 4;

    public GamePanel() { // Constructor
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));// setค่ามิติ
        this.setBackground(Color.GRAY);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void setupGame() {
        gameState = lobbyGame;
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
        setupGame();
        sound = new Sound (this);
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS; // 0.01666 sec
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {
            // 1 update information such as character positions
            update();
            // 2 draw the screen with the updated information
            repaint();

            double remainingTime = nextDrawTime - System.nanoTime();

            try {
                remainingTime = remainingTime / 1000000;
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void update() {
        cat.setSkin(keyH.n);
        if (gameState == startGame) {
            cat.update();
            dog.updateSpeed(cat.score);
            object.updateCoins_HP(hit.numCoins,hit.numHP);
            cat.movement(null);
            dog.movement(null);
            hit.checkHit(cat, dog);
            afk.checkAFK();
        } 
        else if (gameState == stopGame || gameState == endGame) {
            cat.update();
        }
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        if(gameState == startGame || gameState == stopGame){
            if(cat.score < 200000){
                g2.drawImage(BG.BG, 0, 0, 1700, 768, null);
            }
            else{
                g2.drawImage(BG.titleScreen, 0, 0, 1700, 768, null);
            }
            object.drawCoin(g2);
            object.drawHP(g2);
            dog.draw(g2);
            cat.draw(g2);

        }
        if(gameState != stopGame){
            sound.play();
        }
        ui.darw(g2);
        g2.dispose();
    }

}
