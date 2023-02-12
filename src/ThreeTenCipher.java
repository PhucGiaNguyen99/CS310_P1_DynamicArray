import java.util.Arrays;

/**
 * @author Phuc Nguyen
 */
public class ThreeTenCipher {

    private final int INITIAL_CAPACITY = 100;
    private final double GROWTH_RATE = 1.5;

    /**
     * The maximum size of array to allocate.
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * Constructor:
     * Initialize plainText and keys to given values.
     * Initialize capacity to DEFAULT_CAPACITY.
     * Initialize textArchive with DEFAULT_CAPACITY.
     * Initialize sizeStored to 0.
     */
    public ThreeTenCipher(char[][] givenKeys, String givenPlainText) {
        ThreeTenCipher.plainText = givenPlainText.toLowerCase();
        ThreeTenCipher.keys = givenKeys;

        // initialize the capacity to the default capacity of 100
        this.capacity = INITIAL_CAPACITY;

        // initialize textArchive with the capacity
        this.textArchive = new char[INITIAL_CAPACITY];
        this.sizeStored = 0;

        ThreeTenCipher.cipherText = "";
    }


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
     * A character array with initial capacity of 100 that contains all decoded text blocks
     */
    private char[] textArchive;

    /**
     * the size of the stored text in textArchive.
     */
    private int sizeStored = 0;

    /**
     * Adds new text to textArchive.
     * If sizeStored - capacity > 0, expand textArchive 1.5 times.
     * This method should be O(n)
     *
     * @param newText the new text to be added.
     */
    public void insertText(char[] newText) {
        int newTextLength = newText.length;
        ensureCapacity(sizeStored + newTextLength);
        System.arraycopy(newText, 0, textArchive, sizeStored, newTextLength);
        sizeStored += newTextLength;
    }

    /**
     * Expand textArchive by increasing the capacity 1.5 times.
     *
     * @param minCapacity length of the array needed to be appended.
     */
    private void grow(int minCapacity) {
        int newCapacity = capacity + (capacity >> 1);

        // find the larger between newCapacity and required minCapacity
        while (minCapacity - newCapacity > 0) {
            newCapacity = newCapacity + (newCapacity >> 1);
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }
        this.textArchive = Arrays.copyOf(this.textArchive, newCapacity);
        this.capacity = newCapacity;
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    // ensureCapacity()
    // while (isFull)
    // addAll(char[] charArr)
    // new length is size +charArr.length() to ensureCapacityInternal
    private void ensureCapacity(int minCapacity) {
        // if needed new space for new character, expand textArchive 1.5 times
        if (minCapacity - capacity > 0) {
            grow(minCapacity);
        }
    }


    /**
     * Check if the given index is in range. If not throw IndexOutOfBoundsException().
     *
     * @param index the index to be checked.
     */
    private void rangeCheck(int index) {
        if (index >= sizeStored) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    /**
     * A version of rangeCheck used by insert.
     *
     * @param index the index to be checked.
     */
    private void rangeCheckForInsert(int index) {
        if (index > sizeStored || index < 0) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + sizeStored;
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
     * plainText setter
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