import java.util.HashSet;

public class LongSubStr {
    public static void main(String[] args) {
        String str = "pwwkew";
        int left = 0;
        int n = str.length();
        int max_length = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < n; right++) {
            char ch = str.charAt(right);
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            max_length = Math.max(max_length, right - left + 1);
        }

        System.out.println("longest substring is :" + max_length);

    }

}
