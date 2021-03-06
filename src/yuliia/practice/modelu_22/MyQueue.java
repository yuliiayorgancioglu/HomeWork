package yuliia.practice.modelu_22;

/* Implement a custom fixed size collection with default values of 16 or other value specified by user
Every new element will be added to the end of the queue, if the capacity of the queue has been reached
remove the first element it filled and shift the queue elements to the left. */

import yuliia.practice.module_31.MyException;

import java.util.ArrayList;

public class MyQueue<E> extends ArrayList<E> {

    private int defaultSize;

    public MyQueue (){
        this.defaultSize = 16;
    }

    public MyQueue(int customSize) {
        this.defaultSize = customSize;
    }

    public boolean add(E e){
        super.add(e);
        while (size() > defaultSize) {
            super.remove(0);
        }
        return true;
    }
}



