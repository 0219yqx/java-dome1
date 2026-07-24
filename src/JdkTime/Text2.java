package JdkTime;

public class Text2 {
    public static void main(String[] args) {
        System.out.println(myParseInt("123456780"));
    }

    private static boolean myParseInt(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int len = str.length();
        if (len > 10 || len < 1) {
            return false;
        }

        if (str.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                return false;
            }
        }
        int result = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            result = result * 10 + (c - '0');
        }
        return true;
    }
}