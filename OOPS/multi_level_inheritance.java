class A{
    void methodA(){
        System.out.println("Method A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("Method C");
    }
}

public class multi_level_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        System.out.println();
        obj.methodB();
        System.out.println();
        obj.methodC();
    }
}
