import java.util.*;

public class HashMapCode{
    static class HashMap<K, V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n -- nodes
        private int N; //N -- buckets
        private LinkedList<Node> buckets[];
        
        @SuppressWarnings({ "Unchecked", "unchecked" })
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }


        private int hashFunction(K key){
            int bi = key.hashCode(); // returns number 
                return Math.abs(bi)%N; // returns value between 0 and N-1
        }


        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i = 0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }


        @SuppressWarnings("unchecked")
        public void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j<oldBucket.length; j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }


        public void put(K key, V value){
            int bi = hashFunction(key);  // bucket index
            int di = searchInLL(key, bi);// data index    // if di = 0+ then key exists ,, if di = -1 then key doesn't exist
            if(di == -1){  //key doesn't exists
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{     //key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lamda = (double)n/N;
            if(lamda > 2.0){
                // rehashing
                rehash();
            }

        }


        public boolean containsKey(K key){
            int bi = hashFunction(key);  // bucket index
            int di = searchInLL(key, bi);// data index    // if di = 0+ then key exists ,, if di = -1 then key doesn't exist
            if(di == -1){  //key doesn't exists
                return false;
            }
            else{     //key exists
                return true;
            }
        }


        public V remove(K key){
            int bi = hashFunction(key);  // bucket index
            int di = searchInLL(key, bi);// data index    // if di = 0+ then key exists ,, if di = -1 then key doesn't exist
            if(di == -1){  //key doesn't exists
               return null;
            }
            else{     //key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }


        public V get(K key){
            int bi = hashFunction(key);  // bucket index
            int di = searchInLL(key, bi);// data index    // if di = 0+ then key exists ,, if di = -1 then key doesn't exist
            if(di == -1){  //key doesn't exists
                return null;
            }
            else{     //key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }


        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();
            for(int bi = 0; bi<buckets.length; bi++){
                LinkedList<Node> ll = buckets[bi];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("India", 200);
        map.put("USA", 50);
        map.put("China", 150);

        ArrayList<String> keys = map.keyset();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
        map.remove("India");
        System.out.println(map.get("India"));
        map.put("Japan", 10);
        System.out.println(map.get("Japan"));
        System.out.println(map.isEmpty());
        
    }
}