import java.util.ArrayList;

class myGenericClass<T> {
    int val;
    private T val2;

    public myGenericClass(int val, T val2) {
        this.val = val;
        this.val2 = val2;
    }

    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val = val;
    }

    public T getVal2(){
        return val2;
    }
    public void setVal2(T val){
        this.val2 = val;
    }

}
public class Main {
    public static void main(String[] args) {
        
        myGenericClass<String> g1 = new myGenericClass<String>(11, "str experience");
        int val = g1.getVal();
        String str = g1.getVal2();

        System.out.println(val+"     "+str);
    }
}