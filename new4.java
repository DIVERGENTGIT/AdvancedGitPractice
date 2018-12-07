public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is let me check and see vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
