package Polymorfizm;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Мяу-Мяу");
    }

    @Override
    public void makeEat() {
        System.out.println(getName() + " питается рыбой");
    }

    public void move() {
        System.out.println(getName() + " прыгает на лапки");
    }
    @Override
    public void play() {
        System.out.println(getName() + " играет с игрушкой");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " трется о ноги и мурлычет");
    }
}