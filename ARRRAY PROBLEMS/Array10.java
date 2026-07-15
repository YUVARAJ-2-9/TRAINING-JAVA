public class Array10 {
    public static void main(String[] args) {
        int [] arr = {12,45,78,34,90,56};
        sec(arr);
        
    }
    public static int [] sec(int [] arr){
        int lar = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[lar]){
               lar = i;
            }
        }
      arr[lar] = Integer.MIN_VALUE;

      int secl = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
          if(arr[i] > secl){
            secl = arr[i];
          }
       }
    System.out.println("SECOND LAR :" + secl);
        
        
        
        
return arr;

    }
}
