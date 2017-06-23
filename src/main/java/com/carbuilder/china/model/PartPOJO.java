
package com.carbuilder.china.model;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class PartPOJO {
    private int needed;
    private String name;

    public PartPOJO(int needed, String name) {
        this.needed = needed;
        this.name = name;
    }

    public int getNeeded() {
        return needed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + ": " + needed + " ";
    }
    
    
    
}
