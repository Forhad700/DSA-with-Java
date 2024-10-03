import java.util.ArrayList;

public class ArrayList_Ex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.println(list.contains(55));
        System.out.println(list.contains(50));
        System.out.println(list);

        list.set(0, 14);

        System.out.println(list);

        list.remove(4);

        System.out.println(list);
    }
}
