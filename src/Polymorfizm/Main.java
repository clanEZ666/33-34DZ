package Polymorfizm;

public class Main {
    public static void main(String[] args) {

        boolean makeFly = true;

        Animal dog = new Dog("Шарик");
        Animal cat = new Cat("Муся");
        Animal bird = new Bird("Голубь", true);
        Animal crow = new Bird("Ворона", false);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        bird.checkFlyInfo();
        crow.checkFlyInfo();

        dog.makeEat();
        cat.makeEat();
        bird.makeEat();

        bird.move();
        crow.move();

        //Список для демонстрации полиморфного поведения
        Animal[] animals = {dog, cat, bird};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();

         if (animal instanceof Pet) {
             Pet pet = (Pet) animal;
             pet.play();
             pet.beFriendly();
         }

        }

    }

}
