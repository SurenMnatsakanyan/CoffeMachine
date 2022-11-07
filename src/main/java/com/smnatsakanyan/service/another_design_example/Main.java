package com.smnatsakanyan.service.another_design_example;

import com.smnatsakanyan.service.OOP_version.Coffee;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new DefaultCoffeemachine(null);
        Coffee coffee = coffeeMachine.sell(new BuyCoffeeRequest(CofeeType.LATE, 10));

        CheapCoffeeMachine cheapCoffeeMachine = new CheapCoffeeMachine();
        Coffee cheapCoffee = coffeeMachine.sell(new BuyCoffeeRequest(CofeeType.LATE, 10));
    }
}
