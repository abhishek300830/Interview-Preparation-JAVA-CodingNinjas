// find uinque element in Array
public class findUniqueElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 4, 2, 1 };

        // applying XOR (Optimized Sol)

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(ans);
            ans = ans ^ arr[i];

        }
        System.out.println("Unique element is : " + ans);

    }
}
