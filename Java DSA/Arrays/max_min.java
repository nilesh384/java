public class max_min{

    public static int ReturnMax(int[] arr, int N){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int ReturnMin(int[] arr, int N){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 56, 87, -3};
        int N = arr.length;
        System.out.println(ReturnMax(arr, N));
        System.out.println(ReturnMin(arr, N));
    }
}
