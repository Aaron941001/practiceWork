import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<String> permutations = new ArrayList<>();

    public static void permute(String str, int l, int r) {
        if (l == r) {
            permutations.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char[] chars = a.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        permute(str, 0, n - 1);

        System.out.println("All permutations of the string: " + str);
        for (String s : permutations) {
            System.out.print(s + " ");
        }
    }
}
