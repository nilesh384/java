

class Student {
    String name = "Hiten";
    int roll_no;

    
    public void printData(){
        System.out.print(roll_no+": ");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.roll_no = 1;
        student.name = "Ram";
        student.printData();
        System.out.println();
        Student student2 = new Student();
        student2.roll_no = 2;
        student2.name = "Shyam";
        student2.printData();
        System.out.println();
        
    }
}