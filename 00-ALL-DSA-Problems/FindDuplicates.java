public class FindDuplicates {
    public static void main(String[] args) {

        // find duplicate in array
        // where element of 1 to N-1 is entered in array and one of them is occuring
        // twice.
        // find that element
        // you can use Map but optimized is using XOR

        int[] arr = { 1, 2, 3, 4, 5, 4, 6 };

        int ans = 0;
        // XOR with own elements
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        // XOR with 1 to N-1 Elements
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ i;
        }
        System.out.println("Duplicate Element is : " + ans);

    }
}
