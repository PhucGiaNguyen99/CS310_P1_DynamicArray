import java.util.Random;

/**
 * @author maha
 */
public class EncryptDecrypt {

    /**
     * Constant for a string of alphabets.
     */
    private final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

    static String plainText;
    /**
     * this instance variable contains the size of the plainText in the ThreeTenCipher class.
     */
    private int plainTextSize;

    /**
     * plainTextSize setter
     * <p>
     * s set equal to the length of plainText from ThreeTenCipher class
     */
    public void setPlainTextSize(int c) {
        this.plainTextSize = c;
    }

    /**
     * plainTextSize getter
     *
     * @return the plainTextSize
     */
    public int getPlainTextSize() {
        return this.plainTextSize;
    }

    /**
     * Random an integer from 0 to 5 to determine which cipher alphabet to use.
     *
     * @return a random integer from 0 to 5.
     */
    private int randomCipherAlphabetIndexForElement() {
        Random random = new Random();
        return random.nextInt(5);
    }

    /**
     * Get the position of given character in the alphabet ALPHA.
     *
     * @param c given character to determine the position
     * @return index of given character c in ALPHA.
     */
    private int getCharPosition(char c) {
        return ALPHA.indexOf(c);
    }

    /**
     * Get the replacing character in given cipher alphabets.
     *
     * @param charPosition    position of character which is index of the character in ALPHA
     * @param cipherAlphabets given cipher alphabets to convert the character to
     * @return replaced character
     */
    private char getReplacingCharacter(int charPosition, char[] cipherAlphabets) {
        if (charPosition < 0 || charPosition > 25) {
            throw new IllegalArgumentException("Character index must be within 0-25!");
        }
        return cipherAlphabets[charPosition];
    }


    /**
     * this integer array of size equal to plainTextSize
     * contains the random numbers to be used by the encrypt/decrypt methods
     */
    private int[] selectAlpha;


    private int[] generateSelectAlpha() {
        this.selectAlpha = new int[getPlainTextSize()];
        for (int i = 0; i < plainTextSize; i++) {
            this.selectAlpha[i] = randomCipherAlphabetIndexForElement();
        }
        return selectAlpha;
    }

    /**
     * first randomly sets the selectAlpha array to random numbers between 0 and 4 this number indicates which alphabet cipher is used for each letter in plainText
     * accesses the plainText in the ThreeTenCipher then
     * encrypts it and sets the cipherText in the ThreeTenCipher
     */
    public void encrypt() {
        // do with only one cipher alphabet
        char[] cipherAlphabets = new char[]{'C',
                'X',
                'Q',
                'Z',
                'V',
                'T',
                'J',
                'U',
                'W',
                'R',
                'B',
                'H',
                'F',
                'N',
                'O',
                'S',
                'K',
                'L',
                'D',
                'P',
                'G',
                'E',
                'M',
                'A',
                'I',
                'Y'};

    }

    /**
     * uses the cipherText from the ThreeTenCipher and the instance variable selectAlpha
     * decrypts the cipher text
     * then calls the archiveDecrypted to store the resulting string in the ThreeTenCipher testArchive instance variable.
     *
     * @return returns the resulting text.
     */
    public String decrypt() {
        return "";
    }

    /**
     * calls method insertText of the ThreeTenCipher class in order to store the decoded string in textArchive
     *
     * @param s s is passed by the decrypt method
     */
    public void archiveDecrypted(String s) {
    }

    public static void main(String[] args) {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        //for (int i = 0; i < 100; i++) {
        //  System.out.println(encryptDecrypt.randomCipherAlphabetForElement());
        //}
        ThreeTenCipher.plainText = "PLEASEHELPMEMYDEARGOD";
        encryptDecrypt.setPlainTextSize(ThreeTenCipher.plainText.length());
        //encryptDecrypt.setPlainTextSize(plainText.length()....0000000000);
        int[] selectAlpha = encryptDecrypt.generateSelectAlpha();
        for (int i : selectAlpha) {
            System.out.println(i);
        }
    }


}