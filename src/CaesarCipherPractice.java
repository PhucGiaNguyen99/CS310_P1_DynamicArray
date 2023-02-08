import java.util.Locale;
import java.util.Scanner;

public class CaesarCipherPractice {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String msg, int shiftKey) {
        msg = msg.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < msg.length(); i++) {
            int charPos = alpha.indexOf(msg.charAt(i));
            System.out.println("char pos: " + charPos);
            int keyVal = (shiftKey + charPos) % 26;
            System.out.println("Key val: " + keyVal);
            char replaceVal = alpha.charAt(keyVal);
            System.out.println("Replace val: " + replaceVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.println("Enter the String for encryption: ");
        message = sc.next();

        System.out.println("Enter Shift key: ");
        key = sc.nextInt();
        System.out.println("Encrypted message: " + encrypt(message, key));
    }
}
