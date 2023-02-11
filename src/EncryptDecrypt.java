import java.util.Random;

/**
 * @author maha
 */
public class EncryptDecrypt {
    /**
     * Constant for a string of alphabets.
     */
    private final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

    /**
     * this integer array of size equal to plainTextSize
     * contains the random numbers to be used by the encrypt/decrypt methods
     */
    private int[] selectAlpha;

    /**
     * this instance variable contains the size of the plainText in the ThreeTenCipher class.
     */
    private int plainTextSize = ThreeTenCipher.plainText.length();

    /**
     * Generate a random integer from 0 to (upperBound - 1).
     *
     * @return a random integer from 0 to (upperBound - 1).
     */
    //PRIVATE
    private int randomNumber(int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound);
    }

    /**
     * Generate selectAlpha which contains cipher alphabets indexes for characters of plainText.
     *
     * @return an integer array of cipher alphabets indexes
     */
    // Print out which cipher alphabets array applied for each character
    // REMOVE PLAIN TEXT SIZE
    private int[] generateSelectAlpha() {
        this.selectAlpha = new int[getPlainTextSize()];
        int keysLength = ThreeTenCipher.keys.length;
        //System.out.println("");
        for (int i = 0; i < plainTextSize; i++) {
            this.selectAlpha[i] = randomNumber(keysLength);
            //System.out.println("Index " + i + ": " + this.selectAlpha[i]);
        }
        return selectAlpha;
    }


    /**
     * plainTextSize setter.
     *
     * @param c given length to set for plainText of ThreeTenCipher class
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
     * Get the index of given character in the alphabet array constant ALPHA.
     *
     * @param c character to check index of.
     * @return index of given character c in ALPHA.
     */
    //PRIVATE
    private int getCharIndex(char c) {
        System.out.println(c + ": " + ALPHA.indexOf(c));
        return ALPHA.indexOf(c);
    }

    /**
     * Get encrypted character.
     *
     * @param cipherAlphabets given cipher alphabets array
     * @param index           index of character in the array
     * @return
     */
    //PRIVATE
    public char getEncryptedChar(char[] cipherAlphabets, int index) {
        return cipherAlphabets[index];
    }

    /**
     * Get the replacing character in given cipher alphabets.
     *
     * @param charIndex       position of character which is index of the character in ALPHA
     * @param cipherAlphabets given cipher alphabets to convert the character to
     * @return replaced character
     */
    //PRIVATE
    private char getReplacedCharFromCipherArr(char[] cipherAlphabets, int charIndex) {
        if (charIndex < 0 || charIndex > 25) {
            throw new IllegalArgumentException("Character index must be within 0-25!");
        }
        return cipherAlphabets[charIndex];
    }

    /**
     * Encrypt a single character.
     *
     * @param cipherAlphabets      cipher alphabets including 5 arrays with length of 26
     * @param cipherAlphabetsIndex index of the array in the cipher alphabets
     * @param c                    character needed to be encrypted
     * @return
     */
    public char encryptSingleChar(char[][] cipherAlphabets, int cipherAlphabetsIndex, char c) {
        return getReplacedCharFromCipherArr(getCharIndex(c), cipherAlphabets[cipherAlphabetsIndex]);
    }


    /**
     * first randomly sets the selectAlpha array to random numbers between 0 and 4 this number indicates which alphabet cipher is used for each letter in plainText
     * accesses the plainText in the ThreeTenCipher then
     * encrypts it and sets the cipherText in the ThreeTenCipher
     */
    // REMOVE KEYS ARRAY, remove plainText, void
    public String encrypt(char[][] cipherAlphabets) {

        String encryptedText = "";
        int[] selectAlpha = generateSelectAlpha();
        for (int charIndex = 0; charIndex < ThreeTenCipher.plainText.length(); charIndex++) {
            encryptedText += encryptSingleChar(cipherAlphabets, selectAlpha[charIndex], ThreeTenCipher.plainText.charAt(charIndex));
        }
        return encryptedText;

    }

    /**
     * uses the cipherText from the ThreeTenCipher and the instance variable selectAlpha
     * decrypts the cipher text
     * then calls the archiveDecrypted to store the resulting string in the ThreeTenCipher testArchive instance variable.
     *
     * @return returns the resulting text.w
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