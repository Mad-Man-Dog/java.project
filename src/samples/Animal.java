package samples;

public class Animal {
    protected int legs;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void makeSound() {
        System.out.println("Grrr...");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    public void makeSound() {
        System.out.println("Meow");
    }
}