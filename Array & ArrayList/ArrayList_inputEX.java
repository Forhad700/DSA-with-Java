import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_inputEX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer>list = new ArrayList<>(5);

        for(int i=0; i<5; i++){
            list.add(input.nextInt());
        }

        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
