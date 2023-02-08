//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class DynamicArrays<E> {
    private final int DEFAULT_CAPACITY = 100;
    private final double GROW_RATIO = 1.5;
    private int capacity;
    private int size;
    private E[] elementsData;

    public DynamicArrays() {
        this.capacity = 100;
        this.elementsData = (E[]) new Object[this.capacity];
        this.size = 0;
    }

    public DynamicArrays(int initialCapacity) {
        if (initialCapacity > 0) {
            this.capacity = initialCapacity;
            this.elementsData = (E[]) new Object[this.capacity];
            this.size = 0;
        } else {
            throw new IllegalArgumentException("Initial capacity must be larger than 0.");
        }
    }

    public void insert(int index, E element) {
        this.rangeCheck(index);
        this.ensureCapacity();
        System.arraycopy(this.elementsData, index, this.elementsData, index + 1, this.size - index);
        this.elementsData[index] = element;
        ++this.size;
    }

    public boolean append(E newElement) {
        this.ensureCapacity();
        this.elementsData[this.size++] = newElement;
        return true;
    }

    public void ensureCapacity() {
        if (this.isFull()) {
            this.grow();
        }

    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public void grow() {
        int newCapacity = (int)((double)this.capacity * 1.5);
        this.elementsData = Arrays.copyOf(this.elementsData, newCapacity);
        this.capacity = newCapacity;
    }

    public E get(int index) {
        this.rangeCheck(index);
        return this.elementsData[index];
    }

    public E remove(int index) {
        this.rangeCheck(index);
        E oldElement = this.elementsData[index];
        int numShifted = this.size - index - 1;
        if (numShifted > 0) {
            System.arraycopy(this.elementsData, index + 1, this.elementsData, index, numShifted);
        }

        this.elementsData[--this.size] = null;
        return oldElement;
    }

    public E set(int index, E newElement) {
        this.rangeCheck(index);
        E oldElement = this.elementsData[index];
        this.elementsData[index] = newElement;
        return oldElement;
    }

    public void rangeCheck(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(this.outOfBoundsIndexMsg(index));
        }
    }

    public String outOfBoundsIndexMsg(int index) {
        return "Index: " + index + ", Size: " + this.size;
    }

    public String toString() {
        String resultString = "";

        for(int i = 0; i < this.size; ++i) {
            resultString = resultString + String.valueOf(this.elementsData[i]);
            if (i < this.size - 1) {
                resultString = resultString + " ";
            }
        }

        return resultString;
    }
}
