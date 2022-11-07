package com.smnatsakanyan.service.another_design_example;

public class BuyCoffeeRequest {
    private CofeeType type;

    private int money;

    public BuyCoffeeRequest(CofeeType type, int money) {
        this.type = type;
        this.money = money;
    }
}
