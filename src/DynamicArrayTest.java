import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @org.junit.jupiter.api.Test
    void insert() {
        DynamicArrays<Integer> dynamicArray = new DynamicArrays<>();
        dynamicArray.append(1);
        dynamicArray.append(6);
        dynamicArray.append(1);
        dynamicArray.append(0);
        dynamicArray.append(1);
        dynamicArray.append(9);
        dynamicArray.append(9);
        dynamicArray.append(9);
        dynamicArray.insert(3, 2);
        assertEquals("1 6 1 2 0 1 9 9 9", dynamicArray.toString());
    }

    @org.junit.jupiter.api.Test
    void append() {
        DynamicArrays<Integer> dynamicArray = new DynamicArrays<>();
        dynamicArray.append(1);
        dynamicArray.append(6);
        dynamicArray.append(1);
        dynamicArray.append(0);
        dynamicArray.append(1);
        dynamicArray.append(9);
        dynamicArray.append(9);
        dynamicArray.append(9);
        assertEquals("1 6 1 0 1 9 9 9", dynamicArray.toString());
    }

    @org.junit.jupiter.api.Test
    void ensureCapacity() {
    }

    @org.junit.jupiter.api.Test
    void isFull() {
        DynamicArrays<Integer> dynamicArray = new DynamicArrays<>();
        dynamicArray.append(1);
        dynamicArray.append(6);
        dynamicArray.append(1);
        dynamicArray.append(0);
        dynamicArray.append(1);
        dynamicArray.append(9);
        dynamicArray.append(9);
        dynamicArray.append(9);
        assertFalse(dynamicArray.isFull());
    }

    @org.junit.jupiter.api.Test
    void grow() {
    }

    @org.junit.jupiter.api.Test
    void get() {
        DynamicArrays<Integer> dynamicArray = new DynamicArrays<>();
        dynamicArray.append(1);
        dynamicArray.append(6);
        dynamicArray.append(4);
        dynamicArray.append(0);
        dynamicArray.append(8);
        dynamicArray.append(9);
        dynamicArray.append(7);
        dynamicArray.append(2);
        assertEquals(2, Integer.valueOf(dynamicArray.get(7)));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        DynamicArrays<Integer> dynamicArray = new DynamicArrays<>();
        dynamicArray.append(1);
        dynamicArray.append(2);
        dynamicArray.append(3);
        dynamicArray.append(4);
        dynamicArray.append(5);
        dynamicArray.append(6);
        dynamicArray.append(7);
        dynamicArray.append(8);

        dynamicArray.remove(0);
        dynamicArray.remove(6);
        assertEquals("2 3 4 5 6 7", dynamicArray.toString());
    }

    @org.junit.jupiter.api.Test
    void set() {
        DynamicArrays<Integer> dynamicArray = new DynamicArrays<>();
        dynamicArray.append(1);
        dynamicArray.append(2);
        dynamicArray.append(3);
        dynamicArray.append(4);
        dynamicArray.append(5);
        dynamicArray.append(6);
        dynamicArray.append(7);
        dynamicArray.append(8);
        dynamicArray.set(3,9);
        dynamicArray.set(7,0);
        assertEquals("1 2 3 9 5 6 7 0", dynamicArray.toString());
    }

    @org.junit.jupiter.api.Test
    void rangeCheck() {
    }

    @org.junit.jupiter.api.Test
    void outOfBoundsIndexMsg() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}