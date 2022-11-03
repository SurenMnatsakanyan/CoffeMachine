package com.smnatsakanyan.service.OOP_version;

//Every coffee is supposed to have a water and coffee at least.
public abstract class Coffee {
    private final int waterMl;
    private final int coffeeMg;

    public Coffee(int waterMl, int coffeeMg) {
        this.waterMl = waterMl; 
        this.coffeeMg = coffeeMg;
    }

    //copy constructor for avoiding privacy links
    public  Coffee(Coffee coffee){
        this.coffeeMg  = coffee.coffeeMg;
        this.waterMl = coffee.waterMl;
    }
    public int getWaterMl() {
        return waterMl;
    }

    public int getCoffeeMg() {
        return coffeeMg;
    }

    public abstract String getName();
    public abstract int getPrice();

}
