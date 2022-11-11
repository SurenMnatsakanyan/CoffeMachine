package com.smnatsakanyan.service.OOP_version;

import java.util.Objects;

public class Supplies {
    private int waterMl;
    private  int milkMl;
    private int coffeeBeansG;
    private  int numberOfCups;

    public Supplies(int waterMl, int milkMl, int coffeeBeansG, int numberOfCups){
        this.waterMl = waterMl;
        this.milkMl = milkMl;
        this.coffeeBeansG = coffeeBeansG;
        this.numberOfCups = numberOfCups;
    }

    public Supplies(Supplies supplies){
        this.waterMl = supplies.waterMl;
        this.milkMl = supplies.milkMl;
        this.coffeeBeansG = supplies.coffeeBeansG;
        this.numberOfCups = supplies.numberOfCups;
    }

    public Supplies(){
        this(400,540,120,9);
    }

    public int getWaterMl() {
        return waterMl;
    }

    public void setWaterMl(int waterMl) {
        this.waterMl = waterMl;
    }

    public int getMilkMl() {
        return milkMl;
    }

    public void setMilkMl(int milkMl) {
        this.milkMl = milkMl;
    }

    public int getCoffeeBeansG() {
        return coffeeBeansG;
    }

    public void setCoffeeBeansG(int coffeeBeansG) {
        this.coffeeBeansG = coffeeBeansG;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplies supplies = (Supplies) o;
        return waterMl == supplies.waterMl && milkMl == supplies.milkMl && coffeeBeansG == supplies.coffeeBeansG && numberOfCups == supplies.numberOfCups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterMl, milkMl, coffeeBeansG, numberOfCups);
    }
}
