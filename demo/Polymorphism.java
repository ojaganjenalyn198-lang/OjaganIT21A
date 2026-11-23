
package demo;

class Animal {
    void makeSound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Parent-class references
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling overridden methods
        animal1.makeSound();
        animal2.makeSound();
    }
}
