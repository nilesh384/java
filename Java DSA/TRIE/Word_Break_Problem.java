//google interview
public class Word_Break_Problem {

    static class Node{
        Node[] children;
        boolean eow;        // end of word

        public Node(){
            children = new Node[26];   // a to z
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();

    // inserting in trie   => time complexity -- O(L) -->  L = length of string 
    public static void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                // add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length() - 1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    //searching in trie   => time complexity -- O(L) -->  L = length of string
    public static boolean search(String key){          
        Node curr = root;
        
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && node.eow == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);            // i not included
            String secondPart = key.substring(i);                         // starting from i till end

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for (String word : words) {
            insert(word);
        }

        System.out.println(wordBreak(key));
    }
}
