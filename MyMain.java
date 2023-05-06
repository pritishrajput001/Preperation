package com.access;

public class MyMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        
        // Access within the class
        System.out.println(animal.privateField);     // Compilation Error (private)
        System.out.println(animal.defaultField);     // Allowed (default)
        System.out.println(animal.protectedField);   // Allowed (protected)
        System.out.println(animal.publicField);      // Allowed (public)
        
        animal.privateMethod();     // Compilation Error (private)
        animal.defaultMethod();     // Allowed (default)
        animal.protectedMethod();   // Allowed (protected)
        animal.publicMethod();      // Allowed (public)
        
        System.out.println();
        
        // Access outside the class
        Dog dog = new Dog();
        
        System.out.println(dog.privateField);     // Compilation Error (private)
        System.out.println(dog.defaultField);     // Compilation Error (default)
        System.out.println(dog.protectedField);   // Allowed (protected)
        System.out.println(dog.publicField);      // Allowed (public)
        
        dog.protectedMethod();   // Allowed (protected)
        dog.publicMethod();      // Allowed (public)
        dog.dogMethod();         // Allowed (public in subclass)
        
        System.out.println();
        
        // Access outside the package
        System.out.println(dog.publicField);      // Allowed (public)
        
        dog.protectedMethod();   // Allowed (protected)
        dog.publicMethod();      // Allowed (public)
        dog.dogMethod();         // Allowed (public in subclass)
        
        System.out.println();
        
        // Access outside the package and subclasses
        Animal animalFromSubclass = new Dog();
        
        System.out.println(animalFromSubclass.publicField);    // Allowed (public)
        
        animalFromSubclass.publicMethod();   // Allowed (public)
        // animalFromSubclass.dogMethod();   // Compilation Error (not visible in Animal class)
    }
}
