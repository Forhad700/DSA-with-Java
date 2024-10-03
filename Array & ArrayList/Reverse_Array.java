import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,7,8};
        System.out.println(Arrays.toString(arr));
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void revArr(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
