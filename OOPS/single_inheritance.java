class Vehicle{

    double price;
    double mileage;
    String color;
    void display(){
        System.out.println("Price is: "+price);
        System.out.println("Mileage is: "+mileage);
        System.out.println("Color is: "+color);
    }
}

class Car extends Vehicle{

    String brand;
    String fueltype;
    boolean isElectric;
    boolean sunroof;
}

public class single_inheritance {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Maruti";
        car1.fueltype = "Petrol";
        car1.isElectric = false;
        car1.sunroof = true;
        car1.price = 100000;
        car1.mileage = 12.5;
        car1.color = "Red";
        car1.display();
        car1.sunroof = true;

        if(car1.sunroof){
            System.out.println("Car has sunroof");
        }else{
            System.out.println("Car does not have sunroof");
        }
    }
}
