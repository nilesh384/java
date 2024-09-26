class Student{
    private String name;
    private int roll_no;
    private int age;

    public void getName(){
        System.out.println("Name: "+name);
    }

    public void getRoll_no(){
        System.out.println("Roll No: "+roll_no);
    }

    public void getAge(){
        System.out.println("Age: "+age);
    }

    public void setName(String n){
        this.name = n;
    }

    public void setRoll_no(int r){
        this.roll_no = r;
    }

    public void setAge(int a){
        this.age = a;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Jatayu");
        s.setRoll_no(13);
        s.setAge(19);
        s.getName();
        s.getRoll_no();
        s.getAge();
    }
}
