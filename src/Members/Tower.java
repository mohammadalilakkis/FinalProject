package Members;

import Game.Location;
import javafx.scene.image.Image;

import java.util.Locale;

public class Tower {
    //define the range of damage
    private String range ;
    //define the speed of hit
    private double hitSpeed ;
    //define the H P
    private int HP ;
    //define the damage
    private int damage ;
    //define the location of the tower in the map
    private Location location ;

    /**
     * get the image
     * @return image
     */
    public Image getImage() {
        return image;
    }

    /**
     * set the image
     * @param image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    //define the image
    private Image image;


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //define the level
    private int level = 0 ;

    /**
     * get the location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * set the location
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }


    /**
     * get the range
     * @return range
     */
    public String getRange() {
        return range;
    }

    /**
     * set the range
     * @param range
     */
    public void setRange(String range) {
        this.range = range;
    }

    /**
     * get the hit speed
     * @return hit speed
     */
    public double getHitSpeed() {
        return hitSpeed;
    }

    /**
     * set the hit speed
     * @param hitSpeed
     */
    public void setHitSpeed(double hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    /**
     * get the HP
     * @return HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * set the HP
     * @param HP
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * get the damage
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * set the damage
     * @param damage
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * constructor of the tower class
     */
    public Tower(){

    }

}
