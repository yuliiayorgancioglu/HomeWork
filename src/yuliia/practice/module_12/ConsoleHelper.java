package yuliia.practice.module_12;
import java.util.Scanner;

public class ConsoleHelper {

    ArrayHolder ah = new ArrayHolder();

    public void start() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        ah.ArraySet();

        System.out.println("select the method to continue ");
        System.out.println("- press 'a' to sort the Array ");
        System.out.println("- press 'b' to find an Array element ");

        String input = "";

        do {
            input = scanner.nextLine();

            switch (input) {

                case "a":
                    ah.ArraySort();
                    System.out.println("select the method to continue or enter 'done' to exit");
                    break;

                case "b":
                    ah.ArrayFind();
                    System.out.println("select the method to continue or enter 'done' to exit");
                    break;

                default:
                    if(!input.contains("done")) {
                        System.out.println("misprint, try again");
                    }
                    break;
            }
        }
        while (!input.contains("done"));
    }
}

