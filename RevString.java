public class RevString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sachin");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 6-1-0
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println("Reverse the string is :" + sb);
    }

}
