class Apple{
    void methodApple(){
        System.out.println("Method Apple");
    }
}

class Ball extends Apple{
    void methodBall(){
        System.out.println("Method Ball");
    }
}

class Cat extends Apple{
    void methodCat(){
        System.out.println("Method Cat");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        
        Ball obj1 = new Ball();
        obj1.methodApple();
        System.out.println();
        obj1.methodBall();
        System.out.println();

        Cat obj2 = new Cat();
        obj2.methodApple();
        System.out.println();
        obj2.methodCat();
        System.out.println();
    }
}
