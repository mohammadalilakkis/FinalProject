package Members;

import Game.Location;
import javafx.scene.image.Image;

import java.security.PrivateKey;

public class Player {
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    private Image image ;
    //define the levels
    public enum levels{
        ONE ,TWO ,THREE ,FOUR ,FIVE
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private int level = 0 ;
    /**
     * getting the HP
     * @return HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * setting the HP
     * @param HP
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * getting the damage
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * setting the damage
     * @param damage
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    //define all the proprieties of the player
    //define the hp
    private int HP;
    //define the damage
    private int damage;
    //the speed of a hit
    private double hitSpeed;
    //the approxiamte spped
    private String speed ;
    //the target type
    private String Target ;
    //the range of the hits
    private String Range ;
    //damage in a cirle of radius 1
    private boolean isAreaSplash ;
    //the count of the player
    private int count ;
    //the cost of the player
    private int cost ;
    //the location of the player in the map
    private Location location ;
    /**
     * getting the hit speed
     * @return hitSpeed
     */
    public double getHitSpeed() {
        return hitSpeed;
    }

    /**
     * setting the hit speed
     * @param hitSpeed
     */
    public void setHitSpeed(double hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    /**
     * getting the speed
     * @return speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * setting the speed
     * @param speed
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * getting the target type
     * @return target
     */
    public String getTarget() {
        return Target;
    }

    /**
     * setting the target type
     * @param target
     */
    public void setTarget(String target) {
        Target = target;
    }

    /**
     * getting the range of the damage
     * @return Range
     */
    public String getRange() {
        return Range;
    }

    /**
     * setting the range of the damage
     * @param range
     */
    public void setRange(String range) {
        Range = range;
    }

    /**
     * getting the area splash state
     * @return true or false
     */
    public boolean isAreaSplash() {
        return isAreaSplash;
    }

    /**
     * setting the area splash state
     * @param areaSplash
     */
    public void setAreaSplash(boolean areaSplash) {
        isAreaSplash = areaSplash;
    }

    /**
     * getting the count of the player
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * setting the count of the player
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * getting the cost of the player
     * @return cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * setting the count of the player
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * getting the location of the player in the map
     * @return loctaion
     */
    public Location getLocation() {
        return location;
    }

    /**
     * setting the location of the player in the map
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public Player (){

    }


}
