package yuliia.practice.modelu_22;

public class Main {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(4,4);

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(9);

        System.out.println(myQueue);
    }
}
