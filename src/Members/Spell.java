package Members;

import Game.Location;
import javafx.scene.image.Image;

public class Spell {
    //define the radius of damage
    private double radius ;
    //define the cost
    private int cost ;
    //define the damage area
    private int  damageArea ;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //define the level
    private int level =0 ;

    /**
     * get the radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set the radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
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
     * get the damage area
     * @return damage area
     */
    public int getDamageArea() {
        return damageArea;
    }

    /**
     * set the danage area
     * @param damageArea
     */
    public void setDamageArea(int damageArea) {
        this.damageArea = damageArea;
    }

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
    //define the image
    private Image image ;
    //define the location
    private Location location;
}
