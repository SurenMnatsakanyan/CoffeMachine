package com.smnatsakanyan.service.another_design_example;

import com.smnatsakanyan.service.OOP_version.Coffee;
import com.smnatsakanyan.service.OOP_version.Supplies;

public class CheapCoffeeMachine implements CoffeeMachine{

    @Override
    public Coffee sell(BuyCoffeeRequest request) {
        return null;
    }

    @Override
    public void fill(Supplies supplies) {

    }

    @Override
    public int getMoney() {
        return 0;
    }
}
