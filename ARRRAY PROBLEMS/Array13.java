public class Array13 {
    public static void main(String[] args) {
        
        int [] arr = {5,10,15,20,25};
        copy(arr);
    }
    public static int [] copy(int [] arr){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c++;
        }
        System.out.println(c);

        int [] arr1 = new int[c];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1[index] = arr[i];
            index++;
        }
        for (int i : arr1) {
            System.out.println("COPIED ARRAY:" +  i);
        }
        return arr;
    }
}

