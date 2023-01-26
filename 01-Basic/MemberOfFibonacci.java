import java.util.*;

public class MemberOfFibonacci {
    public static boolean checkFibo(int n) {
        int a = 0;
        int b = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        int sum = 2;

        while (sum < n) {
            int c = a + b;
            sum = c;
            list.add(c);
            a = b;
            b = c;
        }
        if (list.contains(n)) {
            System.out.println(list);
            return true;
        } else {
            System.out.println(list);
            return false;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You want to check for Fibonacci Series : ");
        int n = sc.nextInt();
        sc.close();
        boolean result = checkFibo(n);
        if (result == true) {
            System.out.println("YES it is in Series");
        } else {
            System.out.println("Not it is not in Series");
        }

    }
}
