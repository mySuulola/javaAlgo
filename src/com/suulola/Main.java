package com.suulola;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World";
        int[] num = {1,2,3,4,5};
        int[] arrayLength = new int[5];
        int[][] matrixArray = new int[2][3];
        int [][] multi = {{1,2},{4,5,6}};


        String inp = "1.34";
        double inpNum = Double.parseDouble(inp);
        System.out.println(inpNum + 5);






        System.out.println(message.replace("Hello", "Welcome"));
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.deepToString(multi));
        // .deepToString for printing multi dimensional arrays



    }
}
