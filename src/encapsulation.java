public class encapsulation {

    private String name;
    private int age;

    public encapsulation(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if (age>=0){
            this.age=age;
        }
        else{
            System.out.println("Invalid age!!!");
        }
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args){
        encapsulation enc = new encapsulation("Ram",30);

//        enc.setName("Hari");
//        enc.setAge(40);

        enc.display();
    }
}