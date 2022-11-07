package com.smnatsakanyan.service.OOP_version;

public class Latte extends  Coffee{
    private  static  final  int price = 7;

    private static  final  String  name  = "Latte";


    private final int milkMl;

    @Override
    public String getName() {
        return  name;
    }

    public Latte() {
        this(350,20,75);
    }

    //In future maybe we change the  waterMl, coffeeMg,milkMl. Price is assumed to never change.
    public Latte(int waterMl, int coffeeMg, int milkMl) {
       super(waterMl,coffeeMg);
        this.milkMl = milkMl;
    }

    @Override
    public int getPrice() {
        return Latte.price;
    }

    public int getMilkMl() {
        return milkMl;
    }


}
