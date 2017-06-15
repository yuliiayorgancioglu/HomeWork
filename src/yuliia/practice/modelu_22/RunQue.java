package yuliia.practice.modelu_22;

public class RunQue {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(4,5);

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(9);

        System.out.println("Initial queue:");
        System.out.println(myQueue);
        myQueue.add(1);
        System.out.println("Rearranged queue when the capacity is reached :");
        System.out.println(myQueue);

    }
}
