
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create instances of Result class
        Result student1 = new Result(101, 85, 92);
        Result student2 = new Result(102, 78, 88);

        // Display student information
        student1.displayRollNo();
        student1.displayMarks();
        student1.displayTotal();

        student2.displayRollNo();
        student2.displayMarks();
        student2.displayTotal();
    }
}
