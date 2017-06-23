package com.carbuilder.china.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Car Builder Web Application
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class CarPOJO {
    
    private String name;
    private String brand;
    private int canBeBuild;
    private List< PartPOJO> needeParts;

    public CarPOJO(String name, String brand, int canBeBuild, List<PartPOJO> needeParts) {
        this.name = name;
        this.brand = brand;
        this.canBeBuild = canBeBuild;
        this.needeParts = needeParts;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getCanBeBuild() {
        return canBeBuild;
    }

    public List<PartPOJO> getNeedeParts() {
        return needeParts;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Car{" + "name=" + name + ", brand=" + brand + ", canBeBuild=" + canBeBuild + ", needeParts= ";
        for(int i=0;i<needeParts.size();i++){
            str += needeParts.get(i).toString();
        }
        return str;
    }

    public static class Builder {
    
        private int id;
        private String name;
        private String brand;
        private int canBeBuild;
        private List< PartPOJO> needeParts;

        public Builder() {
            this.id = 0;
            this.name = "";
            this.brand = "";
            this.canBeBuild = 0;
            this.needeParts = new LinkedList();
        }

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setCanBeBuild(int canBeBuild) {
            this.canBeBuild = canBeBuild;
            return this;
        }

        public Builder addNeedePart(PartPOJO part) {
            this.needeParts.add(part);
            return this;
        }
    
        public CarPOJO build() {
            return new CarPOJO(this.name, this.brand, this.canBeBuild, this.needeParts);
        }
    
    }
    
}
