package com.rajesh;

public class DeluxeBurger extends Hamburger{
    DeluxeBurger(){
        super("Deluxe","Sausages & Bacon","white",14.5);
        super.addHamburgerAddition1("Chips",1.2);
        super.addHamburgerAddition2("drink",2.5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No addtions on Deluxe Burgers");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No addtions on Deluxe Burgers");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No addtions on Deluxe Burgers");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No addtions on Deluxe Burgers");
    }
}
