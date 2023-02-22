import java.util.ArrayList;

/* 
Sample Input 1 :
abc 2

Sample Output 1 :
aa
ab
ac
ba
bb
bc
ca
cb
cc
 */

public class StringOfLengthK {
    public static ArrayList<String> generateSmallString(String str, int k) {
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                String s = "";
                s += str.charAt(i);
                s += str.charAt(j);
                newList.add(s);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        String str = "abc";
        int k = 2;
        ArrayList<String> list = new ArrayList<>();
        list = generateSmallString(str, k);
        System.out.println(list);
    }

}
