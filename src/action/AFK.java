package action;

import main.*;

public class AFK {
    GamePanel gameP;
    Ui ui = new Ui(gameP);
    KeyHandler keyH;
    Object object = new Object(gameP);
    public int scoreAFK = 0;

    public AFK(GamePanel gameP,KeyHandler keyH) {
        this.gameP = gameP;
        this.keyH = keyH;
    }

    public void checkAFK(){
        updateScoreAFK();
        if(scoreAFK == 500 ){
            gameP.gameState = gameP.stopGame;
            gameP.sound.stop();
        }
    }

    public void updateScoreAFK(){
        if(keyH.upPress == true || keyH.downPress == true){
            scoreAFK = 0;
        }
        if(keyH.upPress == false && keyH.downPress == false){
            scoreAFK ++;
        }
    }
}
