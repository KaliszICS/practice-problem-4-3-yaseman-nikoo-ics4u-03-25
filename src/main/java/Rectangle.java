/**
 * Return the value of width and length based on the inputs
 * @author Yaseman
 * @version 0.29.0
 */
public class Rectangle{
    private double width;
    private double length;
    /**
     * Set the value of the width to 8 and the value length to 3
     */
    public Rectangle(){
        this.width= 8;
        this.length=4;
    }
    /**
     * Set the value of the width and the length to value.
     * @param value
     */
    public Rectangle(double value){
        this.width=8;
        this.length=value;
    }
    /**
     * Set the value of length and width to length and width.
     * @param length
     * @param width
     */
    public Rectangle(double length, double width){
        this.width=width;
        this.length=length;
    }
    /**
     * Getter method to return width
     * @return width
     */
    public double getWidth(){
        return this.width;
    }
    /**
     * Getter method to return length
     * @return length
     */
    public double getLength(){
        return this.length;
    }

}