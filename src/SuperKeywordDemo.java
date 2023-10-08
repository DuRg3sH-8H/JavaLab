class Animal {
    String name;

    // Constructor with a parameter
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    String breed;

    // Constructor in the subclass using the super keyword to call the superclass constructor
    Dog(String name, String breed) {
        super(name); // Calling the constructor of the superclass (Animal)
        this.breed = breed;
        System.out.println("Dog constructor called.");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador");
        myDog.eat(); // Call eat() method from the superclass
        myDog.bark(); // Call bark() method from the subclass
    }
}
