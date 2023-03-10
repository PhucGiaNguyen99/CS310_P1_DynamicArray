import java.util.Arrays;

/**
 * @author Phuc Nguyen
 */
public class ThreeTenCipher {
    /**
     * Constant for initial capacity of textArchive.
     */
    private final int DEFAULT_INITIAL_CAPACITY = 100;


    /**
     * Constant for the maximum size of array to allocate.
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * Empty array instance used for default sized empty instances.
     */
    private static final char[] EMPTY_ELEMENTDATA = {};


    /**
     * Store the capacity of textArchive.
     */
    private int capacity;


    /**
     * Store the cipher alphabets each of 26 characters length.
     */
    public static char[][] keys;

    /**
     * Store the cipher text to be decrypted.
     */
    public static String cipherText;

    /**
     * Store the plain text to be encrypted.
     */
    public static String plainText;

    /**
     * A character array with initial capacity of 100 that contains all decoded text blocks
     */
    private char[] textArchive;

    /**
     * The size of the stored text in textArchive.
     */
    private int sizeStored;

    /**
     * Constructor:
     * -Initialize plainText and keys to given values.
     * -Initialize capacity to DEFAULT_CAPACITY.
     * -Initialize textArchive with DEFAULT_CAPACITY.
     * -Initialize sizeStored to 0.
     */
    public ThreeTenCipher() {
        // initialize the capacity to the default capacity of 100
        this.capacity = DEFAULT_INITIAL_CAPACITY;

        // initialize textArchive with the initial capacity
        this.textArchive = new char[DEFAULT_INITIAL_CAPACITY];


        this.sizeStored = 0;

        // initialize cipherText to an empty string
        ThreeTenCipher.cipherText = "";
    }

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
        // newCapacity is the largest size
        int newCapacity = capacity + (capacity >> 1);

        // keep expanding the capacity 1.5 times until it is larger than minCapacity, which is required
        while (minCapacity - newCapacity > 0) {
            newCapacity = newCapacity + (newCapacity >> 1);
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }
        // copy all the elements of old array to new larger array
        this.textArchive = Arrays.copyOf(this.textArchive, newCapacity);

        // update the new capacity
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // ensureCapacity()
    // while (isFull)
    // addAll(char[] charArr)
    // new length is size +charArr.length() to ensureCapacityInternal
    private void ensureCapacity(int minCapacity) {

        // if required capacity minCapacity is larger than capacity, expand textArchive
        if (minCapacity - capacity > 0) {
            grow(minCapacity);
        }
    }

    /**
     * Check if given index is in range. If not, throws IndexOutOfBoundsException()
     *
     * @param index the index to be checked.
     */
    private void rangeCheck(int index) {
        if (index > sizeStored || index < 0) {
            throw new IndexOutOfBoundsException((index));
        }
    }

    /**
     * Check if given startIndex and endIndex, which is (startIndex + size - 1) is in range. If not, throws IndexOutOfBoundsException()
     * startIndex is inclusive, while endIndex is exclusive.
     *
     * @param startIndex start index to be checked.
     * @param size       number of elements from startIndex.
     */
    private boolean rangeCheckForClean(int startIndex, int size) {
        int endIndex = startIndex + size;
        if (startIndex < 0 || startIndex >= sizeStored || endIndex > sizeStored || size < 0) {
            throw new IndexOutOfBoundsException((outOfBoundsMsgForClean(startIndex, endIndex)));
        }
        return true;
    }

    /**
     * String to notify of invalid start index and end index.
     *
     * @param startIndex invalid start index
     * @param endIndex   invalid end index
     * @return String to notify
     */
    private String outOfBoundsMsgForClean(int startIndex, int endIndex) {
        return "Start index: " + startIndex + ", end index: " + endIndex + ", size: " + sizeStored;
    }

    /**
     * String to notify of invalid start index and end index.
     *
     * @param index   invalid index
     * @return String to notify
     */
    private String outOfBoundMsg(int index) {
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

    // TEST: rangeCheckForClean
    // TEST: after cleanArchivedText, test new sizeStored with given valid parameters
    public boolean cleanArchivedText(int start, int size) {
        rangeCheckForClean(start, size);

        // start index is inclusive, while endIndex is exclusive. Therefore, size = end - start + 1
        int end = start + size;

        // shift all succeeding elements to the left
        int numMoved = sizeStored - end;
        System.arraycopy(textArchive, end, textArchive, start, numMoved);

        int newSize = sizeStored - size;
        for (int i = newSize; i < size; i++) {
            textArchive[i] = '\0';
        }

        // trim the array by decreasing the capacity to newSize
        // set capacity and sizedStore to newSize
        trimToSize(capacity - size);

        // set sizeStored to newSize
        sizeStored = newSize;
        return true;
    }

    /**
     * Trim textArchive to the required capacity.
     *
     * @param newSize
     */
    private void trimToSize(int newSize) {
        if (newSize < capacity) {
            textArchive = (sizeStored == 0) ? EMPTY_ELEMENTDATA : Arrays.copyOf(textArchive, newSize);
            capacity = newSize;
        }
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
        return textArchive;
    }

}