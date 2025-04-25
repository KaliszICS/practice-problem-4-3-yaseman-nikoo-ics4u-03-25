/**
 * Return the number of the leg and the material of the chair based on the inputs.
 * @author Yaseman
 * @version 0.29.0
 */

public class Chair{
    private int leg;
    private String material;
    /**
     * A construct method that set the value of leg to 4 and the value of material to wood.
     */
    public Chair(){
        this.leg=4;
        this.material="wood";
    }
    /**
     *A constructor method that set the value of the leg to the leg and the value of material to the wood.
     * @param leg
     */
    public Chair(int leg){
        this.leg=leg;
        this.material="wood";
    }
    /**
     * A constructor method that set the value of the leg to leg and material to material.
     * @param leg
     * @param material
     */
    public Chair(int leg, String material){
        this.leg=leg;
        this.material=material;
    }
    /**
     * Getter method that access leg
     * @return leg
     */
    public int getLegs(){
        return this.leg;
    }
    /**
     * Getter method that access chair
     * @return chair
     */
    public String getMaterial(){
        return this.material;
    }
}
