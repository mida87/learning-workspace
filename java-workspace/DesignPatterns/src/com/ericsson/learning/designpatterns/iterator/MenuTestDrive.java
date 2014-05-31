package com.ericsson.learning.designpatterns.iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CaffeMenu caffeMenu = new CaffeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, caffeMenu);

        waitress.printMenu();
    }
}
