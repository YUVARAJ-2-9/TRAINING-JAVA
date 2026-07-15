public class Array11 {
    public static void main(String[] args) {
        int [] arr = {12,45,78,34,90,8};
        min(arr);

    }
    public static int[] min(int [] arr){
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        arr[min] = Integer.MAX_VALUE;

        int secs = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[secs]){
                secs = i;
            }
        }
        System.out.println("MIN VALUE :" + arr[secs]);
        
     return arr;
    }
}
