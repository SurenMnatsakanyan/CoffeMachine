package com.smnatsakanyan.service.another_design_example;

import com.smnatsakanyan.service.OOP_version.NotEnoughCoffeeException;
import com.smnatsakanyan.service.OOP_version.Supplies;

public interface SupplyBank {

    void deductingResources(Supplies supplies) throws NotEnoughCoffeeException;

    void fill(Supplies supplies);

    Supplies getCurrentSupplies();
}
