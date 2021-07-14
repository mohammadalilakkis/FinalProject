package Members.Buildings;

import Members.Building;
import javafx.scene.image.Image;

import javax.imageio.IIOImage;

public class KingTower extends Building {
    /**
     * King tower class
     * include tower properties in its constructor
     */
    public KingTower(){
        setImage(new Image("Game/images.jpg"));
        setHitSpeed(1);
        setTarget("Ground & Air");
        setRange("7");
        if (getLevel()==1){
            setHP(2400);
            setDamage(50);
        }else  if (getLevel()==2){
            setHP(2568);
            setDamage(53);
        }
        else  if (getLevel()==3){
            setHP(2736);
            setDamage(57);
        }
        else  if (getLevel()==4){
            setHP(2904);
            setDamage(60);
        }
        else  if (getLevel()==5){
            setHP(3096);
            setDamage(64);
        }

    }
}
