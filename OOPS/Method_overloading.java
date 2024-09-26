public class Method_overloading {

    //Method Overloading

    public static int sum(int a, int b){
        return a+b;
    } 

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static String sum(String a, String b){
        return a+" "+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(3, 5, 2));
        System.out.println(sum("Nilesh", "Bera"));
    }
}
