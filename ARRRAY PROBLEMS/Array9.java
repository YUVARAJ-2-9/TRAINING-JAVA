public class Array9 {
    public static void main(String[] args) {
        int [] arr = {2 ,3 ,2 ,5, 2 ,8};
        int tar = 2;
        occur(arr, tar);
        

    }
    public static int [] occur(int [] arr,int tar){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == tar){
                c++;
            }
        }
        System.out.println("OCCURENCE :" + c);
        return arr;
    }
}
