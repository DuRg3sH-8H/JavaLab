class Animal1 {
    Animal1() {
        System.out.println("Animal constructor");
    }
}

class Mammal extends Animal1 {
    Mammal() {
        super(); // Calls the constructor of the parent class (Animal)
        System.out.println("Mammal constructor");
    }
}

class Dog1 extends Mammal {
    Dog1() {
        super(); // Calls the constructor of the parent class (Mammal)
        System.out.println("Dog constructor");
    }
}

public class ConstructorInMultilevelInheritance {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1(); // Creates an instance of the Dog class
    }
}
