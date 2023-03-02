package action;

import character.*;
import main.GamePanel;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Object extends Entity{
    public BufferedImage coin,boots;
    public BufferedImage HP1,HP2,HP3,HP4,HP5,HP_Plus;
    Font Thars;
    public int numC;
    public int numHP;

    public Object(GamePanel gameP) {
        super(gameP);
        coin = setImage("pic/object/coin");
        HP1 = setImage("pic/object/hp");
        HP2 = setImage("pic/object/hp");
        HP3 = setImage("pic/object/hp");
        HP4 = setImage("pic/object/hp");
        HP5 = setImage("pic/object/hp");
        HP_Plus = setImage("pic/object/hp_Plus");
        boots = setImage("pic/object/boots");
        Thars = new Font("Arial",Font.PLAIN,18);
    }

    public void updateCoins_HP(int numC,int numHP){
        this.numC = numC;
        this.numHP = numHP;
    }

    public void drawCoin(Graphics2D g2){
        g2.drawImage(coin,950,10,50,50,null);
        g2.setColor(Color.white);
        g2.setFont(Thars);
        g2.drawString("X "+numC, 1000, 35);
    }

    public void drawHP(Graphics2D g2){
        if(gameP.hit.numCoins >= 50 && gameP.hit.numHP < 5){
            g2.drawImage(HP_Plus,500,10,50,50,null);
            g2.setColor(Color.white);
            g2.setFont(Thars);
            g2.drawString("coin -"+50, 550, 40);
        }
        if(gameP.hit.numCoins >= 150 && gameP.cat.clawSpeed < 9){
            g2.drawImage(boots,700,10,50,50,null);
            g2.setColor(Color.white);
            g2.setFont(Thars);
            g2.drawString("coin -"+150, 750, 40);
        }
        if(numHP>=1){
            g2.drawImage(HP1,200,10,50,50,null);
        }
        if(numHP>=2){
            g2.drawImage(HP2,230,10,50,50,null);
        }
        if(numHP>=3){
            g2.drawImage(HP3,260,10,50,50,null);
        }
        if(numHP>=4){
            g2.drawImage(HP4,290,10,50,50,null);
        }
        if(numHP==5){
            g2.drawImage(HP5,320,10,50,50,null);
        }
    }
}
