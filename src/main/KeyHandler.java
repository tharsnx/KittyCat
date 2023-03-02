package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import action.Hit;
import character.*;

public class KeyHandler implements KeyListener {
    GamePanel gameP;
    public boolean upPress, downPress, hpPress;
    public int skinCat;
    KeyHandler keyHL;
    Cat cat = new Cat(gameP,keyHL);
    Hit hit = new Hit(gameP);
    public int n;
    int end;

    public KeyHandler(GamePanel gameP) {
        this.gameP = gameP;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        ///////////////////////////////////////////
        if (gameP.gameState == gameP.lobbyGame ){

            if (gameP.ui.lobbyScreenGame==0){
                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP){
                    gameP.ui.commandNum--;
                    if(gameP.ui.commandNum < 0){
                        gameP.ui.commandNum = 2;
                    }
                }
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gameP.ui.commandNum++;
                    if(gameP.ui.commandNum > 2){
                        gameP.ui.commandNum = 0;
                    }
                }
                if (code == KeyEvent.VK_ENTER){
                    if(gameP.ui.commandNum==0){
                        gameP.ui.lobbyScreenGame=1;
                    }
                    if(gameP.ui.commandNum==1){
                        gameP.ui.commandNum=0;
                        gameP.ui.lobbyScreenGame=2;
                    }
                    if(gameP.ui.commandNum==2){
                        System.exit(0);
                    }
                }
            }
            else if (gameP.ui.lobbyScreenGame==1){
                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP){
                    gameP.ui.commandNum--;
                    if(gameP.ui.commandNum < 0){
                        gameP.ui.commandNum = 3;
                    }
                }
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gameP.ui.commandNum++;
                    if(gameP.ui.commandNum > 3){
                        gameP.ui.commandNum = 0;
                    }
                }
                if (code == KeyEvent.VK_ENTER){
                    if(gameP.ui.commandNum==0){
                        n = 1;
                        gameP.sound.n = 1;
                        gameP.gameState = gameP.startGame;
                        gameP.sound.stop();
                        gameP.sound = new Sound (gameP);
                    }
                    if(gameP.ui.commandNum==1){
                        if(gameP.cat.canP[1]==1){
                            n = 2;
                            gameP.sound.n = 2;
                            gameP.gameState = gameP.startGame;
                            gameP.sound.stop();
                            gameP.sound = new Sound (gameP);
                        }
                    }
                    if(gameP.ui.commandNum==2){
                        if(gameP.cat.canP[2]==1){
                            n = 3;
                            gameP.sound.n = 3;
                            gameP.gameState = gameP.startGame;
                            gameP.sound.stop();
                            gameP.sound = new Sound (gameP);
                        }
                    }
                    if(gameP.ui.commandNum==3){
                        gameP.ui.commandNum=0;
                        gameP.ui.lobbyScreenGame = 0;
                    }
                }
            }
            else if (gameP.ui.lobbyScreenGame==2){
                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP){
                    gameP.ui.commandNum--;
                    if(gameP.ui.commandNum < 0){
                        gameP.ui.commandNum = 3;
                    }
                }
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gameP.ui.commandNum++;
                    if(gameP.ui.commandNum > 3){
                        gameP.ui.commandNum = 0;
                    }
                }
                if (code == KeyEvent.VK_ENTER){
                    if(gameP.ui.commandNum==0){
                        gameP.cat.canP[0]=1;
                    }
                    if(gameP.ui.commandNum==1){
                        gameP.cat.canP[1]=1;
                    }
                    if(gameP.ui.commandNum==2){
                        gameP.cat.canP[2]=1;
                    }
                    if(gameP.ui.commandNum==3){
                        gameP.ui.commandNum=0;
                        gameP.ui.lobbyScreenGame = 0;
                    }
                }
            }
        }

        ///////////////////////////////////////////////////////
        if (gameP.gameState == gameP.stopGame){

                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP){
                    gameP.ui.commandNum--;
                    if(gameP.ui.commandNum < 0){
                        gameP.ui.commandNum = 2;
                    }
                }
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gameP.ui.commandNum++;
                    if(gameP.ui.commandNum > 2){
                        gameP.ui.commandNum = 0;
                    }
                }
                if (code == KeyEvent.VK_ENTER){
                    if(gameP.ui.commandNum==0){
                        gameP.afk.scoreAFK = 0;
                        gameP.gameState = gameP.startGame;
                    }
                    if(gameP.ui.commandNum==1){
                        gameP.cat.y = 440;
                        gameP.cat.yClaw = 440;
                        gameP.cat.xClaw = 60;
                        gameP.cat.score = 0;
                        gameP.cat.speed = 4;
                        gameP.dog.x1 = -97;
                        gameP.dog.x2 = -97;
                        gameP.dog.x3 = -97;
                        gameP.dog.x4 = -97;
                        gameP.dog.x5 = -97;
                        gameP.dog.x6 = -97;
                        gameP.dog.x7 = -97;
                        gameP.dog.x8 = -97;
                        gameP.dog.gameSpeed = 3;
                        gameP.hit.numCoins = 0;
                        gameP.hit.numHP = 5;
                        gameP.gameState = gameP.startGame;
                    }
                    if(gameP.ui.commandNum==2){
                        gameP.gameState = gameP.lobbyGame;
                        gameP.sound.stop();
                        gameP.sound = new Sound (gameP);
                        gameP.ui.lobbyScreenGame=0;
                        gameP.ui.commandNum=0;
                    }
                }
            }
        ///////////////////////////////////////////////////////
        if(gameP.gameState == gameP.endGame){
            end = 1;
            if(end == 1){
                gameP.sound.stop();
                gameP.sound = new Sound (gameP);
            }
        }
        if(gameP.gameState != gameP.endGame){
            end = 0;
        }
        if (code == KeyEvent.VK_W) {
            upPress = true;
        }
        if (code == KeyEvent.VK_S) {
            downPress = true;
        }
        if (code == KeyEvent.VK_H) {
            if(gameP.hit.numCoins >= 50 && gameP.hit.numHP < 5){
                gameP.hit.upHp();
            }
        }
        if (code == KeyEvent.VK_J) {
            if(gameP.hit.numCoins >= 150 && gameP.cat.clawSpeed < 9){
                gameP.cat.upClawSpeed();
            }
        }
        if (code == KeyEvent.VK_P) {
            if (gameP.gameState == gameP.startGame) {
                gameP.gameState = gameP.stopGame;
                gameP.ui.lobbyScreenGame=4;
                gameP.sound.stop();
            }
            else if (gameP.gameState == gameP.stopGame) {
                gameP.gameState = gameP.startGame;
                gameP.sound = new Sound (gameP);
            }
        }
        if (code == KeyEvent.VK_O) {
            if (gameP.gameState == gameP.endGame) {
                if(gameP.hit.numCoins >= 2){
                    gameP.hit.numHP = 1;
                    gameP.hit.numCoins -= 200;
                    gameP.sound.stop();
                    gameP.gameState = gameP.startGame;
                    gameP.sound = new Sound (gameP);
                }
            }
        }

        if (code == KeyEvent.VK_ENTER) {
            if (gameP.gameState == gameP.endGame) {
                gameP.gameState = gameP.lobbyGame;
                gameP.ui.lobbyScreenGame=0;
                gameP.ui.commandNum=0;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            upPress = false;
        }
        if (code == KeyEvent.VK_S) {
            downPress = false;
        }
    }

}
