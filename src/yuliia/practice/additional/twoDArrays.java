package yuliia.practice.additional;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {

        int array [][] = new int[2][2];

        array [0][0]= 1;
        array [0][1]= 2;
        array [1][0]= 3;
        array [1][1]= 1;

        for (int r = 0; r < array.length; r++){
            for (int c=0; c < array[r].length; c++ ){
                System.out.println(array[c][r] + " ");
            }
            System.out.println();
        }
    }
}
