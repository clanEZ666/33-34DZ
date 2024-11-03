package Polymorfizm;

public class Dog extends Animal implements Pet {
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

    @Override
    public void move() {
        System.out.println(getName() + " бежит за мячиком");
    }
    @Override
    public void play() {
        System.out.println(getName() + " играет, ловя мяч");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " виляет хвостом");
    }


}

