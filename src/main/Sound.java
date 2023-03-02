package main;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


public class Sound {

    public Clip clip;
    public File background,gameover,Ptann,YOUNGOHM,Kitty;
    AudioInputStream audio;
    GamePanel gameP;
	int n;

	public Sound(GamePanel gameP){
        this.gameP = gameP;
		background = new File("music/background.wav");
        gameover = new File("music/finalsound.wav");
        Ptann = new File("music/Ptann.wav");
		YOUNGOHM = new File("music/Kitty.wav");
        try {
            setS();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void setS()throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		clip = AudioSystem.getClip();
        if(gameP.gameState == gameP.startGame ){
            audio = AudioSystem.getAudioInputStream(YOUNGOHM);
            clip.open(audio);
        }
        else if(gameP.gameState == gameP.endGame ){
            audio = AudioSystem.getAudioInputStream(gameover);
            clip.open(audio);
        }
		else{
			audio = AudioSystem.getAudioInputStream(Ptann);
            clip.open(audio);
		}
    }
			
    public void play(){
        clip.loop(100000);
    }

    public void stop(){
        clip.stop();
    }
}
