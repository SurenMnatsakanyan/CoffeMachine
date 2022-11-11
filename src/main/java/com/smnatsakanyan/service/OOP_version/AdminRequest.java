package com.smnatsakanyan.service.OOP_version;

public class AdminRequest implements AdminInterface {
    private String name;

    public AdminRequest(String name){
        this.name = name;
    }


    public static void fill(Supplies supplies, CoffeeMachine coffeeMachine){
        final int water = coffeeMachine.getSupplies().getWaterMl() + supplies.getWaterMl();
        final int milk = coffeeMachine.getSupplies().getMilkMl() + supplies.getMilkMl();
        final int coffee = coffeeMachine.getSupplies().getCoffeeBeansG() + supplies.getCoffeeBeansG();
        final int cups = coffeeMachine.getSupplies().getNumberOfCups() + supplies.getNumberOfCups();
        coffeeMachine.setSupplies(new Supplies(water,milk,coffee,cups));
    }

    //observer pattern
    @Override
    public void take(CoffeeMachine coffeeMachine) {
        coffeeMachine.setMoney(0);
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

}
