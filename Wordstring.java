public class Wordstring {
    public static void main(String[] args) {
        String str = " Sachin is a Dog ";

        if (str == null || str.length() == 0) {
            System.out.println("");
            return;
        }

        StringBuilder sb = new StringBuilder();
        String[] words = str.trim().split("\\s+");
        int n = words.length;

        for (int i = n - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)
                sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
