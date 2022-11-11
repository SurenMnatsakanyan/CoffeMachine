package com.smnatsakanyan.service.OOP_version;

import java.util.Objects;

public class CoffeeMachine {
    private Supplies supplies;
    private int money;

    public CoffeeMachine(){
        this(new Supplies(400,540,120,9),550);
    }
    //avoid privacy leaks!!
    public CoffeeMachine(Supplies supplies, int money) {
        this.supplies = new Supplies(supplies);
        this.money = money;
    }

    public CoffeeMachine(CoffeeMachine coffeeMachine) {
        this.supplies = new Supplies(coffeeMachine.supplies);
        this.money = coffeeMachine.money;
    }

    public void afterOrderedSupplies(Coffee coffee, CoffeeMachine coffeeMachine, int howMany) throws NotEnoughCoffeeException {
        int price = coffee.getPrice();
        int currentMoney = coffeeMachine.getMoney();
        Supplies supplies = null;
/*
if (price > money) {
            throw new NotEnoughMoneyException("Psl insert enough money in coffee machine");
        }

*/
//        else {
            coffeeMachine.setMoney(currentMoney + price);
            if (coffee.getName().equals("Espresso")) {
                supplies = new Supplies(howMany * coffee.getWaterMl(), 0, howMany * coffee.getCoffeeMg(), howMany);
            } else if (coffee.getName().equals("Latte")) {
                Latte latte = (Latte) coffee;
                supplies = new Supplies(howMany * latte.getWaterMl(), howMany * latte.getMilkMl(), howMany * latte.getCoffeeMg(), howMany);
            } else if (coffee.getName().equals("Cappuccino")) {
                Cappuccino cappuccino = (Cappuccino) coffee;
                supplies = new Supplies(howMany * cappuccino.getWaterMl(), howMany * cappuccino.getMilkMl(), howMany * cappuccino.getCoffeeMg(), howMany);
            }
            coffeeMachine.deductingResources(supplies);
//        }
    }


    private void deductingResources(Supplies supplies) throws NotEnoughCoffeeException {
        int deductedWater = this.supplies.getWaterMl() - supplies.getWaterMl();
        int deductedCoffeeBeansG = this.supplies.getCoffeeBeansG() - supplies.getCoffeeBeansG();
        int deductedMilkMl = this.supplies.getMilkMl() - supplies.getMilkMl();
        int deductedCup = this.supplies.getNumberOfCups() - supplies.getNumberOfCups();
        if (deductedWater <= 0 || deductedCoffeeBeansG <= 0 || deductedMilkMl <= 0 || deductedCup <= 0) {
            throw new NotEnoughCoffeeException("Unfortunately there is no enough resources right now.");
        } else {
            this.setSupplies(new Supplies(deductedWater, deductedMilkMl, deductedCoffeeBeansG, deductedCup));
        }
    }

    public Supplies getSupplies() {
        return new Supplies(supplies);
    }

    public void setSupplies(Supplies supplies) {
        this.supplies = new Supplies(supplies);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeMachine that = (CoffeeMachine) o;
        return money == that.money && Objects.equals(supplies, that.supplies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplies, money);
    }
}

