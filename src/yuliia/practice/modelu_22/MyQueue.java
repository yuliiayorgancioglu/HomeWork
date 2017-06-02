package yuliia.practice.modelu_22;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

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



