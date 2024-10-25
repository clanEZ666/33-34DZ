package Polymorfizm;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Гав-гав!");
    }

    @Override
    public void makeEat() {
        System.out.println(getName() + " ест кость");
    }
}
