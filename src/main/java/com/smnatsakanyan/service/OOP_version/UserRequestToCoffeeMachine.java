package com.smnatsakanyan.service.OOP_version;
public class UserRequestToCoffeeMachine {
    private Coffee coffee;

    public UserRequestToCoffeeMachine(Coffee coffee) {
        if(coffee instanceof  Espresso)
            this.coffee = new Espresso(coffee.getWaterMl(),coffee.getCoffeeMg());
        else if(coffee instanceof  Latte)
            this.coffee = new Latte(coffee.getWaterMl(),coffee.getCoffeeMg(),((Latte) coffee).getMilkMl());
        else if(coffee instanceof  Cappuccino)
            this.coffee = new Cappuccino(coffee.getWaterMl(),coffee.getCoffeeMg(),((Cappuccino) coffee).getMilkMl());
    }

    //logic here
    public void buy(int howMany, CoffeeMachine coffeeMachine) throws NotEnoughCoffeeException{
        coffeeMachine.afterOrderedSupplies(coffee,coffeeMachine,howMany);
    }

    public Coffee getCoffee() {
        Coffee returnResult = null;
        if(coffee.getName().equals("Espresso")){
          returnResult =  new Espresso(coffee.getWaterMl(),coffee.getCoffeeMg());
        } else if (coffee.getName().equals("Latte")) {
            returnResult= new Latte(coffee.getWaterMl(),coffee.getCoffeeMg(),((Latte) coffee).getMilkMl());
        }else if (coffee.getName().equals("Cappuccino")){
            returnResult= new Cappuccino(coffee.getWaterMl(),coffee.getCoffeeMg(),((Latte) coffee).getMilkMl());
        }
        return returnResult;
    }


}
