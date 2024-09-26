
interface PizzaRecepie{
    public void makedough();
    public void addSauce();
    public void addToppings();
    public void bake();
}

class chef1 implements PizzaRecepie{
    
    public void makedough() {
        System.out.println("Making dough by chef1...");
    }

    
    public void addSauce() {
        System.out.println("Adding sauce by chef1...");
    }

    
    public void addToppings() {
        System.out.println("Adding toppings by chef1...");
    }

    
    public void bake() {
        System.out.println("Baking by chef1...");
    }

    public void cut() {
        System.out.println("Cutting by chef1...");
    }
}

class chef2 implements PizzaRecepie{

    public void makedough() {
        System.out.println("Making dough by chef2...");
    }


    public void addSauce() {
        System.out.println("Adding sauce by chef2...");
    }


    public void addToppings() {
        System.out.println("Adding toppings by chef2...");
    }


    public void bake() {
        System.out.println("Baking by chef2...");
    }
    
}



public class InterfaceDemo{
    public static void main(String[] args) {
        PizzaRecepie Style1 = new chef1();
        Style1.makedough();
        Style1.addSauce();
        Style1.addToppings();
        Style1.bake();
        System.out.println("------------");


        PizzaRecepie Style2 = new chef2();
        Style2.makedough();
        Style2.addSauce();
        Style2.addToppings();
        Style2.bake();
        System.out.println("------------");

        chef1 c1 = new chef1();
        c1.cut();
    }
}