
class Bank{
    public void rateOfInterest(){
        System.out.println("Generally Rate of interest is 8%");
    }
}

class SBI extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("Rate of interest in SBI is 7%");
    }
}

class PNB extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("Rate of interest in PNB is 9%");
    }
}

public class Method_overriding{
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.rateOfInterest();
        
        SBI obj1 = new SBI();
        obj1.rateOfInterest();

        PNB obj2 = new PNB();
        obj2.rateOfInterest();
    }
}