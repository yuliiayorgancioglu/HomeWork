package yuliia.practice.module_12;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayHolder {

    int arraySize;
    int[] intArray;
    int userInput;

    public void ArraySet() {

        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        intArray = new int[arraySize];
        System.out.println("Enter " + arraySize + " numbers to fill the array ");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            intArray[i] = scanner.nextInt();
        }
        System.out.println("array set : " + Arrays.toString(intArray));
    }

    public void ArraySort() {

        Arrays.sort(intArray);
        System.out.println("Sorted array : " + Arrays.toString(intArray));
    }

    public void ArrayFind() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your number : ");
        userInput = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < arraySize; i++) {
            if (intArray[i] == userInput) {
                System.out.println("your number is found under index " + (i + 1));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("your number is not found ");
        }
    }
}

