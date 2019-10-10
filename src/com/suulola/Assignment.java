package com.suulola;

import java.util.Scanner;

public class Assignment {

    //Start
    // Input Variables
    // OPTIONAL - determine conditional paths
    // Calculate based on formula or logic involved
    // Display result
    // Stop

    public void calculateLargestOfTwo(double firstNumber, double secondNumber) {
        if (firstNumber == secondNumber) {
            System.out.println("Equal numbers");
            return;
        } else {
            double largest = 0;
            largest = firstNumber > secondNumber ? firstNumber : secondNumber;
            System.out.println("The largest number is  " + largest);
        }
    }

    public void computeAreaAndPerimeterOfATriangle(double a, double b, double c) {
        double perimeterValue = 0;
        double areaValue = 0;
        perimeterValue = a + b + c;

        if (perimeterValue > 0) {
            double p = perimeterValue * 0.5;
            areaValue = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        System.out.println("Perimeter Value is " + perimeterValue + " and Area value is " + areaValue);

    }

    public void computeQuadraticEquation(double a, double b, double c) {
        double firstResult;
        double secondResult;

        double rootResult = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        System.out.println("rootResult is " + rootResult);

        firstResult = (-b + rootResult) / (2 * a);
        secondResult = (-b - rootResult) / (2 * a);

        System.out.println("Result is " + firstResult + " and " + secondResult);
        validateQuadraticResult(firstResult, secondResult, a, b, c);

    }


    public double validateQuadraticResult(double firstResult, double secondResult, double a, double b, double c) {
        double outputOne = (a * Math.pow(firstResult, 2)) + (b * firstResult) + c;
        double outputTwo = (a * Math.pow(secondResult, 2)) + (b * secondResult) + c;
        System.out.println("The output is " + outputOne + " 2nd output is " + outputTwo);
        return outputOne;

    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Select \n 1 for quadratic equation \n 2 to compute Area and Perimeter of Triangle \n 3 to compare largest number");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("For the quadratic equation, input a : ");
                double quadA = input.nextDouble();
                System.out.println("For the quadratic equation, input b : ");
                double quadB = input.nextDouble();
                System.out.println("For the quadratic equation, input c : ");
                double quadC = input.nextDouble();
                Assignment quadratic = new Assignment();
                quadratic.computeQuadraticEquation(quadA, quadB, quadC);
                break;
            case 2:
                System.out.println("For the triangle, input side a : ");
                double triA = input.nextDouble();
                System.out.println("For the triangle, input side b : ");
                double triB = input.nextDouble();
                System.out.println("For the triangle, input side c : ");
                double triC = input.nextDouble();
                Assignment triangle = new Assignment();
                triangle.computeAreaAndPerimeterOfATriangle(triA, triB, triC);
                break;
            case 3:
                System.out.println("Input the first number : ");
                double numA = input.nextDouble();
                System.out.println("Input the second number : ");
                double numB = input.nextDouble();
                Assignment largestNum = new Assignment();
                largestNum.calculateLargestOfTwo(numA, numB);
                break;
            default:
                System.out.println("Wrong choice, please select a number between 1 and 3. Restart Please");
        }


    }
}
