public class printSequences {

    public static void printSeq(String str, String outputSoFar) {

        if (str.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }
        // there are two case to include
        // this is the case where we not considering current char
        printSeq(str.substring(1), outputSoFar);
        // this is the case where we considering the current char
        printSeq(str.substring(1), outputSoFar + str.charAt(0));

    }

    public static void printSeq(String str) {
        printSeq(str, "");

    }

    public static void main(String[] args) {
        String s = "xyz";
        printSeq(s);

    }
}
