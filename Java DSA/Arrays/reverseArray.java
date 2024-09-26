class reverseArray{

    public static void reverseArr(int[] arr){
        int[] revArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            revArr[i] = arr[arr.length-i-1];
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(revArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 56, 87, -3};
        reverseArr(arr);
    }
}