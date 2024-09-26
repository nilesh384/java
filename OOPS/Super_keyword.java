class Animal{
    String colour = "Black";

    void eat(){
        System.out.println("Eating chocolate");
    }

    Animal(){
        System.out.println("Animal constructor called");
        System.out.println();
    }
}

class Dog extends Animal{
    String colour = "White";

    void eat(){
        System.out.println("eating biscuits");
    }

    void work(){
        eat();                      // child class eat method will be called
        System.out.println();                 
        super.eat();                // parent class eat method will be called
        System.out.println();
    }

    void printcolour(){
        System.out.println(colour);   // child class colour will print white
        System.out.println();
        System.out.println(super.colour);  // parent class colour will print black
        System.out.println();
    }

    Dog(){
        super();                       // parent class constructor will be called
        System.out.println("Dog constructor called");
        System.out.println();  // child class constructor will be called
    }
}

public class Super_keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolour();
        d.work();
    }
}
