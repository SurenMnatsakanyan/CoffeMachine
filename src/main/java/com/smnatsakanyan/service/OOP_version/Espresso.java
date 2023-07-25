package com.smnatsakanyan.service.OOP_version;

public class Espresso extends Coffee{
    private  static  final  int price = 4;
    private   static  final  String  name  = "Espresso";

    @Override
    public String getName() {
       
        return name;
    }

    public Espresso() {
        this(250,16);
    }

    //In future maybe we change the  waterMl, coffemg. Price is assumed to never change.
    public Espresso(int waterMl, int coffeeMg) {
          super(waterMl,coffeeMg);
    }

    @Override
    public int getPrice() {
        return Espresso.price;
    }
}
