public class RmvOccSub {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String p = "abc";
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = p.length();
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
            if (sb.length() >= m) {
                String sub = sb.substring(sb.length() - m);
                if (sub.equals(p)) {
                    sb.setLength(sb.length() - m);

                }
            }
        }
        System.out.println("remove occurence String is :" + sb.toString());
    }
}
