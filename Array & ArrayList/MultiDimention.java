import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //int[][] arr = new int[3][];

        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
