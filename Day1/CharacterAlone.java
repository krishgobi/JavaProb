package Day1;

public class CharacterAlone {
    public static void main(String[] args) {
        String str = "H1el2l3o";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                str2 += ch; // append character
            }
        }

        System.out.println("Only letters: " + str2);
  

    }
}
