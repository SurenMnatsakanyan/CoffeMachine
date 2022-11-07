package com.smnatsakanyan.service.another_design_example;

import com.smnatsakanyan.service.OOP_version.Coffee;
import com.smnatsakanyan.service.OOP_version.Supplies;

public interface CoffeeMachine {
    Coffee sell (BuyCoffeeRequest request);
    void fill(Supplies supplies);
    int getMoney();
}
