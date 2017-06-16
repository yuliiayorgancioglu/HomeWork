package yuliia.practice.module_31;

import yuliia.practice.module_21.myArrayList;

public class Main {

    public static void main(String[] args) {

        myArrayList myArray = new myArrayList();

        myArray.add(1);
        myArray.add(8);
        myArray.add(2);
        myArray.add(0);
        System.out.println("initial array: " + myArray.toString());

        myArray.remove(2);
        System.out.println("element removed/condition: " + myArray.toString());

        try {
            myArray.addNew(null);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("element added/condition: " + myArray.toString());

        System.out.println("if array contains specific: " + myArray.contains(2));

        System.out.println("find number by it's index: " + myArray.get(2));

        myArray.getMax();
        myArray.getMin();
        myArray.getAverage();
    }
}

