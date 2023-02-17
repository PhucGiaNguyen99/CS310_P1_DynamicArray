
/**
 * @author PHUC NGUYEN
 */
public class EncryptDecrypt {
    /**
     * Constant for a string of alphabets.
     */
    private final String ORIGINAL_ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    /**
     * An integer array with size equal to plainTextSize contains the random numbers to be used by the encrypt/decrypt methods
     */
    private int[] selectAlpha;

    /**
     * Contains the size of the plainText in the ThreeTenCipher class.
     */
    private int plainTextSize = ThreeTenCipher.plainText.length();

    /**
     * Generate a random integer from 0 to (upperBound - 1).
     *
     * @return a random integer from 0 to (upperBound - 1).
     */
    //PRIVATE
    private int randomNumber(int upperBound) {
        return (int) (Math.random() * upperBound);
    }

    /**
     * Generate selectAlpha which contains cipher alphabets indexes for characters of plainText.
     *
     * @return an integer array of cipher alphabets indexes
     */
    private int[] generateSelectAlpha() {
        this.selectAlpha = new int[getPlainTextSize()];
        int keysLength = ThreeTenCipher.keys.length;
        for (int i = 0; i < plainTextSize; i++) {
            this.selectAlpha[i] = randomNumber(keysLength);
        }
        return selectAlpha;
    }


    /**
     * plainTextSize setter.
     *
     * @param c given length to set for plainText of ThreeTenCipher class
     */
    public void setPlainTextSize(int c) {
        this.plainTextSize = Character.toLowerCase(c);
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
     * Get index of given character in the alphabet array ORIGINAL_ALPHABETS.
     *
     * @param c character to check index of.
     * @return index of given character c.
     */
    private int getCharIndexFromAlphabets(char c) {
        return ORIGINAL_ALPHABETS.indexOf(c);
    }

    /**
     * Given key index, get encrypted value for a character.
     *
     * @param keyIndex index of key array to use in ThreeTenCipher.keys
     * @param c        character to encrypt
     * @return encrypted value of given character
     */
    public char getEncryptedChar(int keyIndex, char c) {
        int charIndex = getCharIndexFromAlphabets(c);
        return ThreeTenCipher.keys[keyIndex][charIndex];
    }

    /**
     * Check if a character is a letter.
     *
     * @param c the character to be checked.
     * @return true if the character is a letter. Otherwise, return false.
     */
    private boolean isCurrentCharALetter(char c) {
        return Character.isLetter(c);
    }

    /**
     * first randomly sets the selectAlpha array to random numbers between 0 and 4 this number indicates which alphabet cipher is used for each letter in plainText
     * accesses the plainText in the ThreeTenCipher then
     * encrypts it and sets the cipherText in the ThreeTenCipher
     */
    // REMOVE KEYS ARRAY, remove plainText, void
    public void encrypt() {
        selectAlpha = generateSelectAlpha();
        for (int charIndex = 0; charIndex < this.plainTextSize; charIndex++) {
            char currentChar = ThreeTenCipher.plainText.charAt(charIndex);

            // if currentChar is a letter, get its encrypted value and append to cipherText
            if (isCurrentCharALetter(currentChar)) {
                int keyIndex = selectAlpha[charIndex];
                ThreeTenCipher.cipherText += getEncryptedChar(keyIndex, currentChar);
            } else {
                ThreeTenCipher.cipherText += currentChar;
            }
        }
    }

    /**
     * Find index of a character in a character array.
     *
     * @param keyArr    the character array to find a character.
     * @param givenChar the character to be searched.
     * @return index of the character.
     */
    private int indexOf(char[] keyArr, char givenChar) {
        for (int i = 0; i < keyArr.length; i++) {
            if (keyArr[i] == givenChar) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Convert a string to a character array.
     *
     * @param givenString the string to be converted.
     * @return character array of the given string.
     */
    private char[] toCharArr(String givenString) {
        return givenString.toCharArray();
    }

    /**
     * Return original character with the character index in key array.
     *
     * @param charIndex index of the character in key array.
     * @return original character
     */
    private char getOriginalChar(int charIndex) {
        return ORIGINAL_ALPHABETS.charAt(charIndex);
    }

    /**
     * uses the cipherText from the ThreeTenCipher and the instance variable selectAlpha
     * decrypts the cipher text
     * then calls the archiveDecrypted to store the resulting string in the ThreeTenCipher testArchive instance variable.
     *
     * @return returns the resulting text.
     */
    public String decrypt() {
        String decryptedText = "";
        for (int charIndex = 0; charIndex < plainTextSize; charIndex++) {
            char currentChar = ThreeTenCipher.cipherText.charAt(charIndex);
            // if currentChar is a letter, get its decrypted value and append it to decryptedText
            if (isCurrentCharALetter(currentChar)) {
                char[] keyArr = ThreeTenCipher.keys[selectAlpha[charIndex]];
                decryptedText += getOriginalChar(indexOf(keyArr, currentChar));
            } else {
                decryptedText += currentChar;
            }
        }
        return decryptedText;
    }

    /*public static void main(String[] args) {
        char[][] givenKeys = new char[][]{
                {
                        'C',
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
                        'Y'
                }, {
                'P',
                'S',
                'O',
                'M',
                'F',
                'E',
                'T',
                'Q',
                'W',
                'A',
                'J',
                'V',
                'L',
                'D',
                'I',
                'H',
                'R',
                'C',
                'X',
                'B',
                'G',
                'N',
                'Z',
                'K',
                'Y',
                'U'
        }, {
                'A',
                'U',
                'B',
                'M',
                'K',
                'W',
                'R',
                'N',
                'S',
                'L',
                'F',
                'C',
                'T',
                'Z',
                'D',
                'X',
                'E',
                'J',
                'Q',
                'O',
                'V',
                'Y',
                'I',
                'G',
                'P',
                'H'
        }, {
                'G',
                'O',
                'Z',
                'T',
                'M',
                'R',
                'N',
                'K',
                'U',
                'H',
                'J',
                'X',
                'B',
                'V',
                'W',
                'C',
                'I',
                'Y',
                'L',
                'F',
                'S',
                'A',
                'E',
                'D',
                'Q',
                'P'
        }, {
                'W',
                'F',
                'Z',
                'Y',
                'H',
                'U',
                'I',
                'A',
                'B',
                'T',
                'D',
                'X',
                'R',
                'E',
                'C',
                'L',
                'Q',
                'O',
                'P',
                'K',
                'M',
                'J',
                'N',
                'S',
                'V',
                'G'
        }
        };
        String plainText = "HelloBitches 123";

        ThreeTenCipher threeTenCipher = new ThreeTenCipher(givenKeys, plainText);
        System.out.println("Plain text: " + plainText);
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();

        // try to print the encrypted text after calling encrypt()
        encryptDecrypt.encrypt();
        System.out.println("Cipher text: " + ThreeTenCipher.cipherText);

        System.out.println("Decrypted text: " + encryptDecrypt.decrypt());
    }*/


}