package Day2;

public class UppertoLowerAndLowertoUpper {
    public static void main(String[] args) {
        String input = "HeLLo WoRLd!";
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
        }
        String result = new String(chars);
        System.out.println(result);
    }
}
