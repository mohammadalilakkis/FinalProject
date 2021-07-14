package Members.Buildings;

import Members.Building;
import javafx.scene.image.Image;

import javax.imageio.IIOImage;

public class Tower extends Building {
    /**
     * Arena tower class
     * include tower properties in its constructor
     */
    public Tower(){
        setImage(new Image("Game/arena tower.jpg"));
        setHitSpeed(0.8);
        setTarget("Ground & Air");
        setRange("7.5");
        if (getLevel()==1){
            setHP(1400);
            setDamage(50);
        }else  if (getLevel()==2){
            setHP(1512);
            setDamage(54);
        }
        else  if (getLevel()==3){
            setHP(1624);
            setDamage(58);
        }
        else  if (getLevel()==4){
            setHP(1750);
            setDamage(62);
        }
        else  if (getLevel()==5){
            setHP(1890);
            setDamage(69);
        }

    }
}
