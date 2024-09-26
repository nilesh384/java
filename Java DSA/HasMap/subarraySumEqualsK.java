//link - https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.HashMap;
public class subarraySumEqualsK{

    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // empty subarray
        int sum = 0;
        int count =0;
        for(int j = 0; j<arr.length; j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(count);
    }
}