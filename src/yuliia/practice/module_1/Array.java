package yuliia.practice.module_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Array {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < 6; i++)
        {
            System.out.print("Enter number " + i + ": " );
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        System.out.println(("Intial array : " + arrayList));
        Collections.sort(arrayList);
        System.out.println(("Sorted array : " + arrayList));

    }
}