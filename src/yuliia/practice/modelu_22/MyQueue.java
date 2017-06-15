package yuliia.practice.modelu_22;

/* Implement a custom fixed size collection with default values of 16 or other value specified by user
Every new element will be added to the end of the queue, if the capacity of the queue has been reached
remove the first element it filled and shift the queue elements to the left */

import java.util.ArrayList;

public class MyQueue<E> extends ArrayList<E> {

    private final int customSize;

    public MyQueue(int defaultSize, int customSize) {
        super(defaultSize);
        this.customSize = customSize;
    }

    @Override
    public boolean add(E e) {
        super.add(e);
        while (size() > customSize) {
            super.remove(0);
        }
        return true;
    }
}
