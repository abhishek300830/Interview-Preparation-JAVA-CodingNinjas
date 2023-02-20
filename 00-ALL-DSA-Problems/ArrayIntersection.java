import java.util.ArrayList;

public class ArrayIntersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int arr2[] = { 4, 5, 6, 9 };

        // this is two pointer approach
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(list);
    }
}
