import java.util.HashSet;
import java.util.Iterator;
public class Hashing{
    public static void main(String[] args) {
        //creation
        HashSet<Integer> set = new HashSet<>();

        //inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);  // not inserted as only unique elements are inserted

        // printing the elements
        System.out.println(set);

        //size of set
        System.out.println("size of the set is: "+set.size());  // size is 4 as only one 1 is taken

        // searching -- contains
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        if(!set.contains(6)){
            System.out.println("set does not contains 6");
        }

        //deleting
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contain 1 -- we deleted it");
        }

        //Iterator (as set has no index we cannot use for(int i =0;....))
        Iterator<Integer> it = set.iterator();

        // hasNext, next
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}