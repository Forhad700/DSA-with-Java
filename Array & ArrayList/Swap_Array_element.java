import java.util.Arrays;

public class Swap_Array_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        
        swap(arr, 0, 2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
