import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Hashing{
    public static void main(String[] args) {
        
        //creation
        // country(key) -- population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("China", 100);
        map.put("US", 30);

        //printing
        System.out.println(map);

        //updation(if key already present)
        map.put("India", 140);
        System.out.println(map);

        //searching
        if(map.containsKey("India")){
            System.out.println("key is present in map");
        }
        else{
            System.out.println("key is present in map");
        }

        //getting values of given key
        System.out.println(map.get("China")); // key present
        System.out.println(map.get("Nepal")); // key absent

        //iteration
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
        System.out.println();

        // another way
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //deleting 
        map.remove("China");
        System.out.println(map);
    }
}