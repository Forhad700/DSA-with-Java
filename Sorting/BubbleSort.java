import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }


    // // if already sorted
    // static void bubble(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         boolean swapped = false;
    //         for(int j=1; j<arr.length-i; j++){
    //             if(arr[j-1]>arr[j]){
    //                 int tmp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = tmp;
    //                 swapped = true;
    //             }
    //         }
    //         if(!swapped){
    //             break;
    //         }
    //     }
    // }
}