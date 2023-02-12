import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textCase = sc.nextInt();

        for (int i = 0; i < textCase; i++) {
            int n_size = sc.nextInt();
            int arr1[] = new int[n_size];
            for (int j = 0; j < n_size; j++) {
                arr1[j] = sc.nextInt();
            }
            int m_size = sc.nextInt();
            int arr2[] = new int[m_size];
            for (int k = 0; k < m_size; k++) {
                arr2[k] = sc.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int a = 0;
            int b = 0;
            if (n_size < m_size) {
                while (a < n_size) {
                    if (arr1[a] < arr2[b]) {
                        a++;
                    } else if (arr1[a] > arr2[b]) {
                        b++;
                    } else {
                        System.out.print(arr1[a] + " ");
                        a++;
                        b++;
                    }
                }
            } else {
                while (b < m_size) {
                    if (arr1[a] < arr2[b]) {
                        a++;
                    } else if (arr1[a] > arr2[b]) {
                        b++;
                    } else {
                        System.out.print(arr1[a] + " ");
                        a++;
                        b++;
                    }
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
