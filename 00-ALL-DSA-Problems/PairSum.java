import java.util.ArrayList;

// import java.util.Collections;
// import java.util.Comparator;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 3, 3, -2 };
        int value = 0;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    ArrayList<Integer> sublist = new ArrayList<>();
                    if (arr[i] < arr[j]) {
                        sublist.add(arr[i]);
                        sublist.add(arr[j]);
                    } else {
                        sublist.add(arr[j]);
                        sublist.add(arr[i]);
                    }
                    list.add(sublist);
                }
            }
        }
        // understansd it later don't know
        // class listComporator implements Comparator<ArrayList> {
        // public int compare(ArrayList l1, ArrayList l2) {
        // return (int) l1.get(0);

        // }
        // }

        // Collections.sort(list, new listComporator());
        System.out.println(list);
    }
}
