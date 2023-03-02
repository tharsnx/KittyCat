package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Ui {
    GamePanel gameP;
    Graphics2D g2;
    Font Thars;
    Background BG = new Background(gameP);
    public int commandNum = 0;
    public int lobbyScreenGame = 0;

    public Ui(GamePanel gameP){
        this.gameP = gameP;
        Thars = new Font("Arial",Font.PLAIN,100);
    }

    public void darw(Graphics2D g2) {
        this.g2 = g2;

        g2.setColor(Color.white);
        g2.setFont(Thars);
        if (gameP.gameState == gameP.lobbyGame) {
            drawtitleScreen();
        }
        if (gameP.gameState == gameP.stopGame) {
            stopScreen();
        }
        if (gameP.gameState == gameP.endGame) {
            endScreen();
        }
        if (gameP.gameState == gameP.chooseSkin) {
            chooseSkin();
        }
    }
    
    public void drawtitleScreen(){
        if(lobbyScreenGame==0){
            g2.drawImage(BG.titleScreen,0,0,1360,768,null);

            g2.setFont(Thars.deriveFont(Font.BOLD,96F));
            String text = "Kitty Cat";
            int x = getxforcenteredText(text);
            int y = gameP.tileSize*3;

            //Shadow
            g2.setColor(Color.black);
            g2.drawString(text, x+5, y+5);

            //Main color
            g2.setColor(Color.gray);
            g2.drawString(text, x, y);

            //Menu
            g2.setFont(Thars.deriveFont(Font.BOLD,45F));

            text = "Start Game";
            x =getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text , x, y);
            if (commandNum==0){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Shop";
            x =getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text , x, y);
            if (commandNum==1){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Quit";
            x =getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text , x, y);
            if (commandNum==2){
                g2.drawString(">", x-gameP.tileSize, y);
            }
        }
        else if(lobbyScreenGame==1){
            g2.drawImage(BG.choos, 0,0,1360,768,null);
            g2.setColor(Color.white);
            g2.setFont(Thars.deriveFont(Font.BOLD,42F));
            
            String text = "Choose your skins!";
            int x = getxforcenteredText(text);
            int y = gameP.tileSize*3;
            g2.drawString(text, x, y);

            text = "Lucky";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 0){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Garfield";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 1){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Kitty";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 2){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Back to Lobby";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 3){
                g2.drawString(">", x-gameP.tileSize, y);
            }
        }
        else if(lobbyScreenGame==2){
            g2.drawImage(BG.shop, 0,0,1360,768,null);
            g2.setColor(Color.white);
            g2.setFont(Thars.deriveFont(Font.BOLD,42F));
            
            String text = "Shopp!!!!!!";
            int x = getxforcenteredText(text);
            int y = gameP.tileSize*3;
            g2.drawString(text, x, y);

            text = "Lucky";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 0){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Garfield";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 1){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Kitty";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 2){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "Back to Lobby";
            x = getxforcenteredText(text);
            y += gameP.tileSize;
            g2.drawString(text, x, y);
            if(commandNum == 3){
                g2.drawString(">", x-gameP.tileSize, y);
            }
        }
    }

    public void stopScreen(){
            String text = "play";
            int x = getxforcenteredText(text);
            int y = gameP.tileSize *2;
            g2.drawString(text, x, y);
            if(commandNum == 0){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "restart";
            x = getxforcenteredText(text);
            y += gameP.tileSize*2;
            g2.drawString(text, x, y);
            if(commandNum == 1){
                g2.drawString(">", x-gameP.tileSize, y);
            }

            text = "lobby";
            x = getxforcenteredText(text);
            y += gameP.tileSize*2;
            g2.drawString(text, x, y);
            if(commandNum == 2){
                g2.drawString(">", x-gameP.tileSize, y);
            }
    }

    public void endScreen(){
        g2.drawImage(BG.gameover,0,0,1360,768,null);
        
    }

    public void chooseSkin(){
        g2.setBackground(null);
        g2.drawImage(BG.titleScreen, null, 0, 0);
    }

    public int getxforcenteredText(String text){

        int length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gameP.screenWidth/2 - length/2;
        return x;
    }
}