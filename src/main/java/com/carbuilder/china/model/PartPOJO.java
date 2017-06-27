
package com.carbuilder.china.model;

import java.util.Objects;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class PartPOJO {
    private final int needed;
    private final String name;

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
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.needed;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartPOJO other = (PartPOJO) obj;
        if (this.needed != other.needed) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  name + ": " + needed + " ";
    }
    
    
    
}
