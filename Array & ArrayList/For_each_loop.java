import java.util.Scanner;

public class For_each_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
