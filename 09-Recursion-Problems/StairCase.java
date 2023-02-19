// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. 
// Implement a method to count how many possible ways the child can run up to the stairs. 
// You need to return number of possible ways W.

public class StairCase {
    public static int NoOfWays(int stairs) {

        // base case
        if (stairs == 1) {
            return 1;
        }
        if (stairs == 2) {
            return 2;
        }
        if (stairs == 3) {
            return 4;
        }

        return NoOfWays(stairs - 1) + NoOfWays(stairs - 2) + NoOfWays(stairs - 3);

    }

    public static void main(String[] args) {
        int stairs = 4;
        int result = NoOfWays(stairs);
        System.out.println(result);
    }
}
