package Polymorfizm;

public class Cat extends Animal {
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
}