public class StaticBlock {
    // Static variable
    static int staticVar;

    // Static block
    static {
        System.out.println("Static block is executed.");
        staticVar = 42;
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + staticVar);
    }
}
