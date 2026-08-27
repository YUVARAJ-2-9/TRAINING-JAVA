public class Array12 {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};
        sort(arr);

    }
    public static boolean sort(int [] arr){
       boolean  isSorted = true;
       
       for (int i = 1; i < arr.length; i++) {
        if(arr[i-1] < arr[i]){
            isSorted = false;
            break;
        }
       
       }
       if(isSorted){
        System.out.println("unsorted");
       }
       else{
        System.out.println("sorted");
       }

        return isSorted;
    }
}
