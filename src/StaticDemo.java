public class StaticDemo {
    // Static variable
    static int staticVar = 0;

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.staticVar = 1;
        obj2.staticVar = 2;

        System.out.println("Static variable in obj1: " + obj1.staticVar); // Outputs 2
        System.out.println("Static variable in obj2: " + obj2.staticVar); // Outputs 2
    }
}
