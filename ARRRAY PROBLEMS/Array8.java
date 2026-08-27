public class Array8 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int tar = 30;
        linear(arr, tar);

    }
    public static int []linear(int[]arr,int tar){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == tar){
                System.out.println("Found at index"+i);
            }
        }
        return arr;
    }

    
}
