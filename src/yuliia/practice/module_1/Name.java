package yuliia.practice.module_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Name {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        System.out.println(" Hello, " + name);
    }
}
