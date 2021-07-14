package Members;

import Game.Location;
import javafx.scene.image.Image;

public class Building {
    //define all the propieties of the spells
    //define the speed of hit
    private double hitSpeed ;
    //define the target type
    private String target ;
    //define the range
    private String Range ;
    //define the life time of the spell
    private int lifeTime ;
    //define the cost of the spell
    private int cost ;
    //define the HP
    private int HP;
    //define the damage
    private int damage ;
    //define the location
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    //define the image
    private Image image ;


    /**
     * get the level of spell
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * set the level
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

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

    //define the level
    private int level = 0 ;
    //define the location
    private Location location ;

    /**
     * 'get the speed of hit
     * @return hitspeed
     */
    public double getHitSpeed() {
        return hitSpeed;
    }

    /**
     * set the speed of hit
     * @param hitSpeed
     */
    public void setHitSpeed(double hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    /**
     * get the target type
     * @return target
     */
    public String getTarget() {
        return target;
    }

    /**
     * set the target type
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * get the range
     * @return range
     */
    public String getRange() {
        return Range;
    }

    /**
     * set the range
     * @param range
     */
    public void setRange(String range) {
        Range = range;
    }

    /**
     * get the  life time
     * @return lifetime
     */
    public int getLifeTime() {
        return lifeTime;
    }

    /**
     * set the life time
     * @param lifeTime
     */
    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    /**
     * get the cost
     * @return cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * set the cost
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
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
}
