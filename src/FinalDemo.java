public class FinalDemo {
    // Final variable
    final int finalVar = 10;

    // Final method
    final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        // obj.finalVar = 20; // Cannot modify final variable
        // obj.finalMethod(); // Cannot override final method
    }
}
