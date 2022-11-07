package com.smnatsakanyan.service.OOP_version;

public class AdminRequest implements adminInterface {
    private static int income;
    private String name;
    private CoffeeMachine coffeeMachine;
    public AdminRequest(String name, CoffeeMachine coffeeMachine){
        this.name = name;
        this.coffeeMachine = new CoffeeMachine(coffeeMachine);
    }

    @Override
    public void fill(Supplies supplies){
        int water = this.coffeeMachine.getSupplies().getWaterMl() + supplies.getWaterMl();
        int milk = this.coffeeMachine.getSupplies().getMilkMl() + supplies.getMilkMl();
        int coffee = this.coffeeMachine.getSupplies().getCoffeeBeansG() + supplies.getCoffeeBeansG();
        int cups = this.coffeeMachine.getSupplies().getNumberOfCups() + supplies.getNumberOfCups();
        coffeeMachine.setSupplies(new Supplies(water,milk,coffee,cups));
    }

    @Override
    public int take() {
        income += coffeeMachine.getMoney();
        coffeeMachine.setMoney(0);
        return income;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public CoffeeMachine getCoffeeMachine() {
        return new CoffeeMachine(coffeeMachine);
    }
}
