package Polymorfizm;

public abstract class Animal {
    private String name;

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void makeSoung() {

        System.out.println("Животное издает звук");
    }

    public abstract void makeSound();

    public void canFly() {

        System.out.println("Птица летит");
    }

    public void checkFlyInfo() {

    }

    public void makeEat() {

        System.out.println("Животное ест");
    }

    public abstract void move();

}
