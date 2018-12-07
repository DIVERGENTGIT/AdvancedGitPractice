public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is must be vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
