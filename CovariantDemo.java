package com.covariant;
class Animal {
    public Animal reproduce() {
        System.out.println("Animal is reproducing.");
        return new Animal();
    }
    
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public Dog reproduce() {
        System.out.println("Dog is reproducing.");
        return new Dog();
    }
    
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

public class CovariantDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animalReproduction = animal.reproduce();
        animalReproduction.makeSound();  // Output: "Animal is making a sound."
        
        System.out.println();
        
        Dog dog = new Dog();
        Dog dogReproduction = dog.reproduce();
        dogReproduction.makeSound();  // Output: "Dog is barking."
    }
}
