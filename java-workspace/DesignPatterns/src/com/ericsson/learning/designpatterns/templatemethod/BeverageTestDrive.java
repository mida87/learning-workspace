package com.ericsson.learning.designpatterns.templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        SugarFreeCoffee sugarFreeCoffee = new SugarFreeCoffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee..");
        coffee.prepareRecipe();

        System.out.println("\nMaking sugar free coffee..");
        sugarFreeCoffee.prepareRecipe();
    }
}
