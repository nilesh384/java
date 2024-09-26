import java.util.HashSet;
public class unionOf2Arrays {
    
public static void unionOfArrays(int[] arr1, int[] arr2){
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i<arr1.length; i++){
        set.add(arr1[i]);
    }
    for(int j = 0; j<arr2.length; j++){
        set.add(arr2[j]);
    }
    System.out.println(set);
    System.out.println(set.size());
}

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,5,6};

        unionOfArrays(arr1, arr2);
    }
}
