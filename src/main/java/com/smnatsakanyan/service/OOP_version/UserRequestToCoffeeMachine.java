package com.smnatsakanyan.service.OOP_version;
public class UserRequestToCoffeeMachine {
    private CoffeeMachine coffeeMachine;
    private int money;
    private Coffee coffee;

    public UserRequestToCoffeeMachine(int money, Coffee coffee, CoffeeMachine coffeeMachine) {
        this.money = money;
        if(coffee instanceof  Espresso)
            this.coffee = new Espresso(coffee.getWaterMl(),coffee.getCoffeeMg());
        else if(coffee instanceof  Latte)
            this.coffee = new Latte(coffee.getWaterMl(),coffee.getCoffeeMg(),((Latte) coffee).getMilkMl());
        else if(coffee instanceof  Cappuccino)
            this.coffee = new Cappuccino(coffee.getWaterMl(),coffee.getCoffeeMg(),((Cappuccino) coffee).getMilkMl());
        this.coffeeMachine = new CoffeeMachine(coffeeMachine);

    }

    //logic here
    public void buy(int howMany){
         try {
             coffeeMachine.afterOrderedSupplies(coffee,coffeeMachine,howMany);
         }catch (NotEnoughMoneyException e){
             e.printStackTrace();
         }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public CoffeeMachine getCoffeeMachine() {
        return new CoffeeMachine(coffeeMachine);
    }

    public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = new CoffeeMachine(coffeeMachine);
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
