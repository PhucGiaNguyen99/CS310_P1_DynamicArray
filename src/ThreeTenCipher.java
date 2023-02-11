import javax.crypto.Cipher;
import java.util.Arrays;

/**
 * @author Phuc Nguyen
 */
public class ThreeTenCipher {

    /**
     * Constructor:
     * Initialize plainText and keys to given values.
     * Initialize capacity to DEFAULT_CAPACITY.
     * Initialize textArchive with DEFAULT_CAPACITY.
     * Initialize sizeStored to 0.
     */
    public ThreeTenCipher(char[][] givenKeys, String givenPlainText) {
        plainText = givenPlainText;
        keys = givenKeys;

        // initialize the capacity to the default capacity of 100
        this.capacity = DEFAULT_CAPACITY;

        // initialize textArchive with the capacity
        this.textArchive = new char[DEFAULT_CAPACITY];
        this.sizeStored = 0;

        cipherText = "";
    }

    private final int DEFAULT_CAPACITY = 100;
    private final double GROWTH_RATE = 1.5;

    /**
     * Store the capacity of textArchive.
     */
    private int capacity;


    /**
     * Store the 5 cipher alphabets each of 26 characters length.
     */
    public static char[][] keys;

    /**
     * This is the cipher text to be decrypted.
     */
    public static String cipherText;

    /**
     * The plain text to be encrypted.
     */
    public static String plainText;

    /**
     *  A character array with initial capacity of 100 that contains all decoded text blocks
     */
    private char[] textArchive;

    /**
     * the size of the stored text in textArchive.
     */
    private int sizeStored = 0;

    /**
     * Adds a new text to the textArchive.
     * If textArchive is full, it will increase the size to 1.5 the original size to accommodate the new text inserted.
     * This method should be O(n)
     *
     * @param newText the new text to be added to textArchive
     */
    public void insertText(char[] newText) {

    }

    /**
     * Expand the textArchive with the growRate of 1.5.
     */
    public void grow() {
        int newCapacity = (int) ((double) this.capacity * 1.5);
        this.textArchive = Arrays.copyOf(this.textArchive, newCapacity);
        this.capacity = newCapacity;
    }

    /**
     * removes all the character data from start to size-1.
     * It throws NoTextException, if there is no data to remove.
     * It should shrink the size after deleting the corresponding character data by setting it to a new capacity of capacity-size.
     * You need to check that the indices are valid or else throw an ArrayIndexOutOfBounds exception.
     * Returns true if successful.
     * This method should be O(n).
     *
     * @param start the index in textArchive from which to start removing
     * @param size  the number of elements to remove from textArchive
     * @return returns true if successful
     */
    public boolean cleanArchivedText(int start, int size) {
        return true;
    }

    /**
     * maximum storage capacity of textArchive.
     *
     * @return returns the maximum storage capacity of textArchive.
     */
    public int getStorageCapacity() {
        return this.capacity;
    }

    /**
     * @return returns the size of character data inserted in the textArchive.
     */
    public int getSize() {
        return this.sizeStored;
    }

    /**
     * Check if the textArchive is empty by checking if the storedSize == 0.
     *
     * @return true if textArchive is empty
     */
    public boolean isEmpty() {
        return this.sizeStored == 0;
    }

    /**
     * Checks if the textArchive is full by checking if the storedSize == capacity.
     *
     * @return true if textArchive is full
     */
    public boolean isFull() {
        return this.sizeStored == this.capacity;
    }

    /**
     * cipherText setter
     *
     * @param cipher to set cipherText
     */
    public void setCipherText(String cipher) {
        ThreeTenCipher.cipherText = cipher;
    }

    /**
     * cipherText getter
     *
     * @return cipherText
     */
    public String getCipherText() {
        return ThreeTenCipher.cipherText;
    }

    /**
     * plaiText setter
     *
     * @param plain to set plainText
     */
    public void setPlainText(String plain) {
        plainText = plain;
    }

    /**
     * plainText getter
     *
     * @return plainText
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * sets the keys
     * set the size of keys to be 5 of 26 length cipher alphabets.
     *
     * @param keys the cipher alphabets of 26 length each
     * @param size 5 cipher alphabet keys
     */
    public char[][] setKeys(char[][] keys, int size) {
        keys = keys;
        return keys;
    }

    /**
     * getTextArchive
     * returns the characters of textArchive from start to size-1
     */
    public char[] getTextArchive(int start, int size) {
        return null;
    }

}