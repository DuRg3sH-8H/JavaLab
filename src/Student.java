// Class Student with roll_no
class Student {
    protected int roll_no; // protected variable can be accessed by subclasses

    // Constructor to set roll_no
    public Student(int roll_no) {
        this.roll_no = roll_no;
    }

    // Method to read roll_no
    public void readRollNo() {
        System.out.println("Enter Roll No: " + roll_no);
    }

    // Method to display roll_no
    public void displayRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

// Class Test inheriting from Student with subject marks
class Test extends Student {
    public int subject1Marks;
    public int subject2Marks;

    // Constructor to set roll_no and subject marks
    public Test(int roll_no, int subject1Marks, int subject2Marks) {
        super(roll_no); // Call the constructor of the superclass (Student)
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
    }

    // Method to read subject marks
    public void readMarks() {
        System.out.println("Enter Subject 1 Marks: " + subject1Marks);
        System.out.println("Enter Subject 2 Marks: " + subject2Marks);
    }

    // Method to display subject marks
    public void displayMarks() {
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
    }
}

// Class Result inheriting from Test with total marks
class Result extends Test {
    private int total;

    // Constructor to set roll_no, subject marks, and calculate total
    public Result(int roll_no, int subject1Marks, int subject2Marks) {
        super(roll_no, subject1Marks, subject2Marks); // Call the constructor of the superclass (Test)
        calculateTotal(); // Calculate the total when the object is created
    }

    // Method to calculate total marks
    private void calculateTotal() {
        total = subject1Marks + subject2Marks;
    }

    // Method to display total marks
    public void displayTotal() {
        System.out.println("Total Marks: " + total);
    }
}
