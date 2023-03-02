package action;

import character.*;
import main.GamePanel;
import main.*;

public class Hit {
    GamePanel gameP;
    Ui ui = new Ui(gameP);
    Object object = new Object(gameP);
    public int numCoins = 0;
    public int numHP = 5;
    public int endGame;

    public Hit(GamePanel gameP) {
        this.gameP = gameP;
    }

    public boolean checkHit(Cat cat,Dog dog){
        if(((((gameP.cat.yClaw+(16) < dog.y1+14 && gameP.cat.yClaw+(46) >= dog.y1+14)||(gameP.cat.yClaw+(16) >= dog.y1+14 && gameP.cat.yClaw+(46) < dog.y1+57)||(gameP.cat.yClaw+(16) <= dog.y1+57 && gameP.cat.yClaw+(46) > dog.y1+57)) && (dog.image1 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y1+8 && gameP.cat.yClaw+(46) >= dog.y1+8)||(gameP.cat.yClaw+(16) >= dog.y1+8 && gameP.cat.yClaw+(46) < dog.y1+64)||(gameP.cat.yClaw+(16) <= dog.y1+64 && gameP.cat.yClaw+(46) > dog.y1+64)) && (dog.image1 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y1 && gameP.cat.yClaw+(46) >= dog.y1)||(gameP.cat.yClaw+(16) >= dog.y1 && gameP.cat.yClaw+(46) < dog.y1+84)||(gameP.cat.yClaw+(16) <= dog.y1+84 && gameP.cat.yClaw+(46) > dog.y1+84)) && (dog.image1 == dog.dog3)))
        && (cat.xClaw >= dog.x1 && cat.xClaw <= dog.x1+95)){
            dog.x1 = -97;
            cat.xClaw = 35;
            if(dog.image1 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image1 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image1 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y2+14 && gameP.cat.yClaw+(46) >= dog.y2+14)||(gameP.cat.yClaw+(16) >= dog.y2+14 && gameP.cat.yClaw+(46) < dog.y2+57)||(gameP.cat.yClaw+(16) <= dog.y2+57 && gameP.cat.yClaw+(46) > dog.y2+57)) && (dog.image2 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y2+8 && gameP.cat.yClaw+(46) >= dog.y2+8)||(gameP.cat.yClaw+(16) >= dog.y2+8 && gameP.cat.yClaw+(46) < dog.y2+64)||(gameP.cat.yClaw+(16) <= dog.y2+64 && gameP.cat.yClaw+(46) > dog.y2+64)) && (dog.image2 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y2 && gameP.cat.yClaw+(46) >= dog.y2)||(gameP.cat.yClaw+(16) >= dog.y2 && gameP.cat.yClaw+(46) < dog.y2+84)||(gameP.cat.yClaw+(16) <= dog.y2+84 && gameP.cat.yClaw+(46) > dog.y2+84)) && (dog.image2 == dog.dog3)))
        && (cat.xClaw >= dog.x2 && cat.xClaw <= dog.x2+95)){
            dog.x2 = -97;
            cat.xClaw = 35;
            if(dog.image2 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image2 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image2 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y3+14 && gameP.cat.yClaw+(46) >= dog.y3+14)||(gameP.cat.yClaw+(16) >= dog.y3+14 && gameP.cat.yClaw+(46) < dog.y3+57)||(gameP.cat.yClaw+(16) <= dog.y3+57 && gameP.cat.yClaw+(46) > dog.y3+57)) && (dog.image3 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y3+8 && gameP.cat.yClaw+(46) >= dog.y3+8)||(gameP.cat.yClaw+(16) >= dog.y3+8 && gameP.cat.yClaw+(46) < dog.y3+64)||(gameP.cat.yClaw+(16) <= dog.y3+64 && gameP.cat.yClaw+(46) > dog.y3+64)) && (dog.image3 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y3 && gameP.cat.yClaw+(46) >= dog.y3)||(gameP.cat.yClaw+(16) >= dog.y3 && gameP.cat.yClaw+(46) < dog.y3+84)||(gameP.cat.yClaw+(16) <= dog.y3+84 && gameP.cat.yClaw+(46) > dog.y3+84)) && (dog.image3 == dog.dog3)))
        && (cat.xClaw >= dog.x3 && cat.xClaw <= dog.x3+95)){
            dog.x3 = -97;
            cat.xClaw = 35;
            if(dog.image3 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image3 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image3 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y4+14 && gameP.cat.yClaw+(46) >= dog.y4+14)||(gameP.cat.yClaw+(16) >= dog.y4+14 && gameP.cat.yClaw+(46) < dog.y4+57)||(gameP.cat.yClaw+(16) <= dog.y4+57 && gameP.cat.yClaw+(46) > dog.y4+57)) && (dog.image4 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y4+8 && gameP.cat.yClaw+(46) >= dog.y4+8)||(gameP.cat.yClaw+(16) >= dog.y4+8 && gameP.cat.yClaw+(46) < dog.y4+64)||(gameP.cat.yClaw+(16) <= dog.y4+64 && gameP.cat.yClaw+(46) > dog.y4+64)) && (dog.image4 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y4 && gameP.cat.yClaw+(46) >= dog.y4)||(gameP.cat.yClaw+(16) >= dog.y4 && gameP.cat.yClaw+(46) < dog.y4+84)||(gameP.cat.yClaw+(16) <= dog.y4+84 && gameP.cat.yClaw+(46) > dog.y4+84)) && (dog.image4 == dog.dog3)))
        && (cat.xClaw >= dog.x4 && cat.xClaw <= dog.x4+95)){
            dog.x4 = -97;
            cat.xClaw = 35;
            if(dog.image4 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image4 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image4 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y5+14 && gameP.cat.yClaw+(46) >= dog.y5+14)||(gameP.cat.yClaw+(16) >= dog.y5+14 && gameP.cat.yClaw+(46) < dog.y5+57)||(gameP.cat.yClaw+(16) <= dog.y5+57 && gameP.cat.yClaw+(46) > dog.y5+57)) && (dog.image5 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y5+8 && gameP.cat.yClaw+(46) >= dog.y5+8)||(gameP.cat.yClaw+(16) >= dog.y5+8 && gameP.cat.yClaw+(46) < dog.y5+64)||(gameP.cat.yClaw+(16) <= dog.y5+64 && gameP.cat.yClaw+(46) > dog.y5+64)) && (dog.image5 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y5 && gameP.cat.yClaw+(46) >= dog.y5)||(gameP.cat.yClaw+(16) >= dog.y5 && gameP.cat.yClaw+(46) < dog.y5+84)||(gameP.cat.yClaw+(16) <= dog.y5+84 && gameP.cat.yClaw+(46) > dog.y5+84)) && (dog.image5 == dog.dog3)))
        && (cat.xClaw >= dog.x5 && cat.xClaw <= dog.x5+95)){
            dog.x5 = -97;
            cat.xClaw = 35;
            if(dog.image5 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image5 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image5 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y6+14 && gameP.cat.yClaw+(46) >= dog.y6+14)||(gameP.cat.yClaw+(16) >= dog.y6+14 && gameP.cat.yClaw+(46) < dog.y6+57)||(gameP.cat.yClaw+(16) <= dog.y6+57 && gameP.cat.yClaw+(46) > dog.y6+57)) && (dog.image6 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y6+8 && gameP.cat.yClaw+(46) >= dog.y6+8)||(gameP.cat.yClaw+(16) >= dog.y6+8 && gameP.cat.yClaw+(46) < dog.y6+64)||(gameP.cat.yClaw+(16) <= dog.y6+64 && gameP.cat.yClaw+(46) > dog.y6+64)) && (dog.image6 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y6 && gameP.cat.yClaw+(46) >= dog.y6)||(gameP.cat.yClaw+(16) >= dog.y6 && gameP.cat.yClaw+(46) < dog.y6+84)||(gameP.cat.yClaw+(16) <= dog.y6+84 && gameP.cat.yClaw+(46) > dog.y6+84)) && (dog.image6 == dog.dog3)))
        && (cat.xClaw >= dog.x6 && cat.xClaw <= dog.x6+95)){
            dog.x6 = -97;
            cat.xClaw = 35;
            if(dog.image6 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image6 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image6 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y7+14 && gameP.cat.yClaw+(46) >= dog.y7+14)||(gameP.cat.yClaw+(16) >= dog.y7+14 && gameP.cat.yClaw+(46) < dog.y7+57)||(gameP.cat.yClaw+(16) <= dog.y7+57 && gameP.cat.yClaw+(46) > dog.y7+57)) && (dog.image7 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y7+8 && gameP.cat.yClaw+(46) >= dog.y7+8)||(gameP.cat.yClaw+(16) >= dog.y7+8 && gameP.cat.yClaw+(46) < dog.y7+64)||(gameP.cat.yClaw+(16) <= dog.y7+64 && gameP.cat.yClaw+(46) > dog.y7+64)) && (dog.image7 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y7 && gameP.cat.yClaw+(46) >= dog.y7)||(gameP.cat.yClaw+(16) >= dog.y7 && gameP.cat.yClaw+(46) < dog.y7+84)||(gameP.cat.yClaw+(16) <= dog.y7+84 && gameP.cat.yClaw+(46) > dog.y7+84)) && (dog.image7 == dog.dog3)))
        && (cat.xClaw >= dog.x7 && cat.xClaw <= dog.x7+95)){
            dog.x7 = -97;
            cat.xClaw = 35;
            if(dog.image7 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image7 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image7 == dog.dog3){
                numCoins += 3;
            }
        }
        else if(((((gameP.cat.yClaw+(16) < dog.y8+14 && gameP.cat.yClaw+(46) >= dog.y8+14)||(gameP.cat.yClaw+(16) >= dog.y8+14 && gameP.cat.yClaw+(46) < dog.y8+57)||(gameP.cat.yClaw+(16) <= dog.y8+57 && gameP.cat.yClaw+(46) > dog.y8+57)) && (dog.image8 == dog.dog1)) || 
        (((gameP.cat.yClaw+(16) < dog.y8+8 && gameP.cat.yClaw+(46) >= dog.y8+8)||(gameP.cat.yClaw+(16) >= dog.y8+8 && gameP.cat.yClaw+(46) < dog.y8+64)||(gameP.cat.yClaw+(16) <= dog.y8+64 && gameP.cat.yClaw+(46) > dog.y8+64)) && (dog.image8 == dog.dog2)) ||
        (((gameP.cat.yClaw+(16) < dog.y8 && gameP.cat.yClaw+(46) >= dog.y8)||(gameP.cat.yClaw+(16) >= dog.y8 && gameP.cat.yClaw+(46) < dog.y8+84)||(gameP.cat.yClaw+(16) <= dog.y8+84 && gameP.cat.yClaw+(46) > dog.y8+84)) && (dog.image8 == dog.dog3)))
        && (cat.xClaw >= dog.x8 && cat.xClaw <= dog.x8+95)){
            dog.x8 = -97;
            cat.xClaw = 35;
            if(dog.image8 == dog.dog1){
                numCoins += 1;
            }
            else if(dog.image8 == dog.dog2){
                numCoins += 2;
            }
            else if(dog.image8 == dog.dog3){
                numCoins += 3;
            }
        }
        //////////////////////////////////////////////////////
        if(((((gameP.cat.y+(7) < dog.y1+14 && gameP.cat.y+(67) >= dog.y1+14)||(gameP.cat.y+(7) >= dog.y1+14 && gameP.cat.y+(67) < dog.y1+57)||(gameP.cat.y+(7) <= dog.y1+57 && gameP.cat.y+(67) > dog.y1+57)) && (dog.image1 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y1+8 && gameP.cat.yClaw+(67) >= dog.y1+8)||(gameP.cat.y+(7) >= dog.y1+8 && gameP.cat.y+(67) < dog.y1+64)||(gameP.cat.y+(7) <= dog.y1+64 && gameP.cat.y+(67) > dog.y1+64)) && (dog.image1 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y1 && gameP.cat.yClaw+(67) >= dog.y1)||(gameP.cat.y+(7) >= dog.y1 && gameP.cat.y+(67) < dog.y1+84)||(gameP.cat.y+(7) <= dog.y1+84 && gameP.cat.y+(67) > dog.y1+84)) && (dog.image1 == dog.dog3)))
        && (cat.x >= dog.x1 && cat.x <= dog.x1+95)){
            dog.x1 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y2+14 && gameP.cat.y+(67) >= dog.y2+14)||(gameP.cat.y+(7) >= dog.y2+14 && gameP.cat.y+(67) < dog.y2+57)||(gameP.cat.y+(7) <= dog.y2+57 && gameP.cat.y+(67) > dog.y2+57)) && (dog.image2 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y2+8 && gameP.cat.yClaw+(67) >= dog.y2+8)||(gameP.cat.y+(7) >= dog.y2+8 && gameP.cat.y+(67) < dog.y2+64)||(gameP.cat.y+(7) <= dog.y2+64 && gameP.cat.y+(67) > dog.y2+64)) && (dog.image2 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y2 && gameP.cat.yClaw+(67) >= dog.y2)||(gameP.cat.y+(7) >= dog.y2 && gameP.cat.y+(67) < dog.y2+84)||(gameP.cat.y+(7) <= dog.y2+84 && gameP.cat.y+(67) > dog.y2+84)) && (dog.image2 == dog.dog3)))
        && (cat.x >= dog.x2 && cat.x <= dog.x2+95)){
            dog.x2 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y3+14 && gameP.cat.y+(67) >= dog.y3+14)||(gameP.cat.y+(7) >= dog.y3+14 && gameP.cat.y+(67) < dog.y3+57)||(gameP.cat.y+(7) <= dog.y3+57 && gameP.cat.y+(67) > dog.y3+57)) && (dog.image3 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y3+8 && gameP.cat.yClaw+(67) >= dog.y3+8)||(gameP.cat.y+(7) >= dog.y3+8 && gameP.cat.y+(67) < dog.y3+64)||(gameP.cat.y+(7) <= dog.y3+64 && gameP.cat.y+(67) > dog.y3+64)) && (dog.image3 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y3 && gameP.cat.yClaw+(67) >= dog.y3)||(gameP.cat.y+(7) >= dog.y3 && gameP.cat.y+(67) < dog.y3+84)||(gameP.cat.y+(7) <= dog.y3+84 && gameP.cat.y+(67) > dog.y3+84)) && (dog.image3 == dog.dog3)))
        && (cat.x >= dog.x3 && cat.x <= dog.x3+95)){
            dog.x3 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y4+14 && gameP.cat.y+(67) >= dog.y4+14)||(gameP.cat.y+(7) >= dog.y4+14 && gameP.cat.y+(67) < dog.y4+57)||(gameP.cat.y+(7) <= dog.y4+57 && gameP.cat.y+(67) > dog.y4+57)) && (dog.image4 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y4+8 && gameP.cat.yClaw+(67) >= dog.y4+8)||(gameP.cat.y+(7) >= dog.y4+8 && gameP.cat.y+(67) < dog.y4+64)||(gameP.cat.y+(7) <= dog.y4+64 && gameP.cat.y+(67) > dog.y4+64)) && (dog.image4 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y4 && gameP.cat.yClaw+(67) >= dog.y4)||(gameP.cat.y+(7) >= dog.y4 && gameP.cat.y+(67) < dog.y4+84)||(gameP.cat.y+(7) <= dog.y4+84 && gameP.cat.y+(67) > dog.y4+84)) && (dog.image4 == dog.dog3)))
        && (cat.x >= dog.x4 && cat.x <= dog.x4+95)){
            dog.x4 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y5+14 && gameP.cat.y+(67) >= dog.y5+14)||(gameP.cat.y+(7) >= dog.y5+14 && gameP.cat.y+(67) < dog.y5+57)||(gameP.cat.y+(7) <= dog.y5+57 && gameP.cat.y+(67) > dog.y5+57)) && (dog.image5 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y5+8 && gameP.cat.yClaw+(67) >= dog.y5+8)||(gameP.cat.y+(7) >= dog.y5+8 && gameP.cat.y+(67) < dog.y5+64)||(gameP.cat.y+(7) <= dog.y5+64 && gameP.cat.y+(67) > dog.y5+64)) && (dog.image5 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y5 && gameP.cat.yClaw+(67) >= dog.y5)||(gameP.cat.y+(7) >= dog.y5 && gameP.cat.y+(67) < dog.y5+84)||(gameP.cat.y+(7) <= dog.y5+84 && gameP.cat.y+(67) > dog.y5+84)) && (dog.image5 == dog.dog3)))
        && (cat.x >= dog.x5 && cat.x <= dog.x5+95)){
            dog.x5 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y6+14 && gameP.cat.y+(67) >= dog.y6+14)||(gameP.cat.y+(7) >= dog.y6+14 && gameP.cat.y+(67) < dog.y6+57)||(gameP.cat.y+(7) <= dog.y6+57 && gameP.cat.y+(67) > dog.y6+57)) && (dog.image6 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y6+8 && gameP.cat.yClaw+(67) >= dog.y6+8)||(gameP.cat.y+(7) >= dog.y6+8 && gameP.cat.y+(67) < dog.y6+64)||(gameP.cat.y+(7) <= dog.y6+64 && gameP.cat.y+(67) > dog.y6+64)) && (dog.image6 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y6 && gameP.cat.yClaw+(67) >= dog.y6)||(gameP.cat.y+(7) >= dog.y6 && gameP.cat.y+(67) < dog.y6+84)||(gameP.cat.y+(7) <= dog.y6+84 && gameP.cat.y+(67) > dog.y6+84)) && (dog.image6 == dog.dog3)))
        && (cat.x >= dog.x6 && cat.x <= dog.x6+95)){
            dog.x6 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y7+14 && gameP.cat.y+(67) >= dog.y7+14)||(gameP.cat.y+(7) >= dog.y7+14 && gameP.cat.y+(67) < dog.y7+57)||(gameP.cat.y+(7) <= dog.y7+57 && gameP.cat.y+(67) > dog.y7+57)) && (dog.image7 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y7+8 && gameP.cat.yClaw+(67) >= dog.y7+8)||(gameP.cat.y+(7) >= dog.y7+8 && gameP.cat.y+(67) < dog.y7+64)||(gameP.cat.y+(7) <= dog.y7+64 && gameP.cat.y+(67) > dog.y7+64)) && (dog.image7 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y7 && gameP.cat.yClaw+(67) >= dog.y7)||(gameP.cat.y+(7) >= dog.y7 && gameP.cat.y+(67) < dog.y7+84)||(gameP.cat.y+(7) <= dog.y7+84 && gameP.cat.y+(67) > dog.y7+84)) && (dog.image7 == dog.dog3)))
        && (cat.x >= dog.x7 && cat.x <= dog.x7+95)){
            dog.x7 = -97;
            numHP -= 1;
        }
        else if(((((gameP.cat.y+(7) < dog.y8+14 && gameP.cat.y+(67) >= dog.y8+14)||(gameP.cat.y+(7) >= dog.y8+14 && gameP.cat.y+(67) < dog.y8+57)||(gameP.cat.y+(7) <= dog.y8+57 && gameP.cat.y+(67) > dog.y8+57)) && (dog.image8 == dog.dog1)) || 
        (((gameP.cat.y+(7) < dog.y8+8 && gameP.cat.yClaw+(67) >= dog.y8+8)||(gameP.cat.y+(7) >= dog.y8+8 && gameP.cat.y+(67) < dog.y8+64)||(gameP.cat.y+(7) <= dog.y8+64 && gameP.cat.y+(67) > dog.y8+64)) && (dog.image8 == dog.dog2)) ||
        (((gameP.cat.y+(7) < dog.y8 && gameP.cat.yClaw+(67) >= dog.y8)||(gameP.cat.y+(7) >= dog.y8 && gameP.cat.y+(67) < dog.y8+84)||(gameP.cat.y+(7) <= dog.y8+84 && gameP.cat.y+(67) > dog.y8+84)) && (dog.image8 == dog.dog3)))
        && (cat.x >= dog.x8 && cat.x <= dog.x8+95)){
            dog.x8 = -97;
            numHP -= 1;
        }
        ///////////////////////////////////////////////////////////////
        if(numHP == 0){
            gameP.gameState = gameP.endGame;
        }
        //////////////////////////////////////////////////////////////
        return false;
    }

    public void upHp(){
        numHP++;
        numCoins-=50;
    }
}
