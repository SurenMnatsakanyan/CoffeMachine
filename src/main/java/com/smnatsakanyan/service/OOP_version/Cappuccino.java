package com.smnatsakanyan.service.OOP_version;

public class Cappuccino extends Coffee{
    private  static  final  int price = 6;

    private   static  final  String  name  = "Cappuccino";


    private final int milkMl;

    @Override
    public String getName() {
        return  name;
    }

    public Cappuccino() {
        this(200,12,100);
    }

    //In future maybe we change the  waterMl, coffemg,milkMl. Price is assumed to never change.

    public Cappuccino(int waterMl, int coffeeMg, int milkMl) {
        super(waterMl,coffeeMg);
        this.milkMl = milkMl;
    }

    @Override
    public int getPrice() {
        return Cappuccino.price;
    }

    public int getMilkMl() {
        return milkMl;
    }
}
