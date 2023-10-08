// Base class or superclass
class Animals {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass inheriting from Animal
class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Subclass inheriting from Dog
class Bulldogs extends Dogs {
    void specialSkill() {
        System.out.println("Bulldog has a special skill.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Bulldogs myDog = new Bulldogs();

        // Calling methods from Animal class
        myDog.eat();

        // Calling methods from Dog class
        myDog.bark();

        // Calling methods from Bulldog class
        myDog.specialSkill();
    }
}
