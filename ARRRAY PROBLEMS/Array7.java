public class Array7 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        rev(arr);

    }
    public static int[] rev(int[]arr){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i : arr) {
            System.out.println("SWAPPED VALUES:" + i);
        }
        return arr;
    }
}
