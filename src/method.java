public class method {
    static void myMethod(String fname) {
        System.out.println(fname);
    }
    static void myMethod(int number) {
        System.out.println(number);
    }
    static void myMethod(int x, int y) {
        int sum = x+y;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        myMethod("ram");
        myMethod("Hari");
        myMethod(12);
        myMethod(13);
        myMethod(12,13);
    }
}