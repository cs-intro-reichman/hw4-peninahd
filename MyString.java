public class MyString {
    public static void main(String[] args) {
        System.out.println(contains("historical", "story")); // false
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerStr = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 32) {
                lowerStr += c;
            }
            if (c < 97 && c != 32) {
                c += 32;
                lowerStr += c;
            } else if (c >= 97) {
                lowerStr += c;
            } 
            }
        return lowerStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            boolean found = false;

            for (int j = 0; j < str1.length(); j ++) {
                char a = str1.charAt(j);
                if (a == 32) {
                    break;
                }
                if (c == a) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
