class Parent {
    int x = 10;

    void display() {
        System.out.println("Value of x in Parent: " + x);
    }
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Value of x in Child: " + x);
        System.out.println("Value of x in Parent (using super): " + super.x);
        super.display(); // Call the display() method of the parent class
    }
}

public class SuperKeywordForNameHiding {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
