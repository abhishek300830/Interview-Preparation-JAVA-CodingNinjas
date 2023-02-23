public class HollowRombus {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            // left
            for (int j = n; j > 0; j--) {
                if (j > i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            // right
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            if (i != n) {
                System.out.println();
            }

        }
        // System.out.println(" Abhi");
        for (int i = n - 1; i >= 0; i--) {
            // left
            for (int j = n; j > 0; j--) {
                if (j > i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // right
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            if (i != 0) {

                System.out.println();
            }
        }

    }
}
