import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(0, 500);
        list.set(0, 999);
        System.out.println(list);

    }
}
