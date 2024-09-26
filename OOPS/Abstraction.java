abstract class Car{
    abstract public void fueltype();

    public void color(){
        System.out.println("Color is Black");
    }
}

class Tesla extends Car{
    Tesla(){
        System.out.println("TESLA");
        System.out.println();
    }
    public void fueltype(){
        System.out.println("Fuel type is Electricity");
    }
}

class Mahindra extends Car{
    Mahindra(){
        System.out.println("MAHINDRA");
        System.out.println();
    }
    public void fueltype(){
        System.out.println("Fuel type is Petrol");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.fueltype();
        t.color();
        System.out.println();
        Mahindra m = new Mahindra();
        m.fueltype();
        m.color();
    }
}
