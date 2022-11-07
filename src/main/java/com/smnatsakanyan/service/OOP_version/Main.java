package com.smnatsakanyan.service.OOP_version;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static CoffeeMachine buy(CoffeeMachine coffeeMachine, int coffeeType)  throws NotEnoughCoffeeException, NotEnoughMoneyException{
        Coffee coffee = null;
            if(coffeeType == 1){
                coffee = new Espresso();
            } else if (coffeeType ==2) {
                coffee  = new Latte();
            } else if (coffeeType == 3) {
                coffee = new Cappuccino();
            }

        UserRequestToCoffeeMachine userRequestToCoffeeMachine = new UserRequestToCoffeeMachine(coffee.getPrice(), coffee,coffeeMachine);
            userRequestToCoffeeMachine.buy(1);
        return   userRequestToCoffeeMachine.getCoffeeMachine();
    }

    public static  CoffeeMachine fill(int water, int milk, int coffeeGram, int cups, CoffeeMachine coffeeMachine){
        AdminRequest adminRequest = new AdminRequest("Suren", coffeeMachine);
        adminRequest.fill(new Supplies(water,milk,coffeeGram,cups));
        return adminRequest.getCoffeeMachine();
    }
    public static void printCoffeeMachineInfo(CoffeeMachine coffeeMachine){
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine.getSupplies().getWaterMl() + " ml of water");
        System.out.println(coffeeMachine.getSupplies().getMilkMl() + " ml of milk");
        System.out.println(coffeeMachine.getSupplies().getCoffeeBeansG() + " g of coffee beans");
        System.out.println(coffeeMachine.getSupplies().getNumberOfCups() + " disposable cups");
        System.out.println(coffeeMachine.getMoney() + "$ of money");
    }

    public  static  CoffeeMachine take(CoffeeMachine coffeeMachine){
        AdminRequest adminRequest = new AdminRequest("Suren", coffeeMachine);
        adminRequest.take();
        return  adminRequest.getCoffeeMachine();
    }
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(new Supplies(400,540, 120,9), 550);
        printCoffeeMachineInfo(coffeeMachine);
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, quit):");
        String decision = sc.next();
        while (!decision.equals("quit")) {
            switch (decision) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    int coffeeType = sc.nextInt();
                    try {
                        coffeeMachine = buy(coffeeMachine, coffeeType);
                        printCoffeeMachineInfo(coffeeMachine);
                    } catch (NotEnoughCoffeeException | NotEnoughMoneyException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case "fill" -> {
                    System.out.println("Write how many ml of water you want to add:");
                    int water = sc.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeGram = sc.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    int cups = sc.nextInt();
                    coffeeMachine = fill(water, milk, coffeeGram, cups, coffeeMachine);
                    printCoffeeMachineInfo(coffeeMachine);
                }
                case "take" -> {
                    System.out.println("I gave you $" + coffeeMachine.getMoney());
                    coffeeMachine = take(coffeeMachine);
                    printCoffeeMachineInfo(coffeeMachine);
                }
            }
            System.out.println("Write action (buy, fill, take, quit):");
            decision = sc.next();
        }
        System.out.println("Bye!");
        System.exit(0);
    }
}
