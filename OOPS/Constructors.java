class Student{
    String name;
    int roll_no;
    int age;

    Student(String n_a_m_e, int r_o_l_l, int a_g_e){          //PARAMETERISED CONSTRUCTOR
        this.name = n_a_m_e;
        this.roll_no = r_o_l_l;
        this.age = a_g_e;

        System.out.println("Parameterized Constructor Called");
        System.out.println();
        System.out.println("NAME: "+name);
        System.out.println("ROLL NO: "+roll_no);
        System.out.println("AGE: "+age);
        System.out.println();
    }

    Student(){                                                //DEFAULT CONSTRUCTOR
        System.out.println("Default Constructor Called");
        System.out.println();
    }

    void printData(){
        System.out.println("NAME: "+name);
        System.out.println("ROLL NO: "+roll_no);
        System.out.println("AGE: "+age);
    }

}

public class Constructors {
    public static void main(String[] args) {
        
        // Student s1 = new Student("Ram", 1, 18);           PARAMETERISED CONSTRUCTOR

        Student s = new Student();                       //  DEFAULT CONSTRUCTOR
        s.name = "Hiten";
        s.roll_no = 1;
        s.age = 18;

        s.printData();
    } 
}
