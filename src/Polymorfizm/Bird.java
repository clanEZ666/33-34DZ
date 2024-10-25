package Polymorfizm;

public class Bird extends Animal {
    private boolean canFly = true;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Чирик Чирик");
    }

    public void checkFlyInfo() {
        if (canFly) {
            System.out.println(getName() + "  может лететь");
        } else {
            System.out.println(getName() + " не может лететь");
        }
    }

    @Override
    public void makeEat() {
        System.out.println(getName() + " питается семенами");
    }
}