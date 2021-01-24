package exerciseFivePointOneSix;
//(Bar Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks. For example,
//        if your program reads the number 7, it should display *******. Display the bars of asterisks after
//        you read all five numbers.

import java.util.Scanner;

public class BarChart {
//    private int[] numbers = new int[5];
//    public static String getNumber() {
//        Scanner input = new Scanner(System.in);
//            System.out.println("enter first number: ");
//            int firstNumber = input.nextInt();
//            System.out.println("enter second number: ");
//            int secondNumber = input.nextInt();
//            System.out.println("enter third number: ");
//            int thirdNumber = input.nextInt();
//            System.out.println("enter fourth number: ");
//            int fourthNumber = input.nextInt();
//            System.out.println("enter fifth number: ");
//            int fifthNumber = input.nextInt();
//
//        System.out.println(displayStars(firstNumber));
//        System.out.println(displayStars(secondNumber));
//        System.out.println( displayStars(thirdNumber));
//        System.out.println( displayStars(fourthNumber));
//        System.out.println(displayStars(fifthNumber));
//
//        return null;
//    }
//
//    private static String displayStars(int number){
//        String asterisk = "";
//        if(number > 1 && number <= 30) {
//
//            for (int i = 0; i < number; i++) {
//                asterisk += "*";
//            }
//        }else {
//            asterisk+="invalid input";
//        }
//       return asterisk;
//    }

//    public void collectNumbers() {
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter a number ");
//            int number = input.nextInt();
//            if (number >= 1 && number <= 30) {
//                numbers[i] = number;
//            } else {
//                System.out.println("Number must be within 1 and 30");
//            }
//        }
//    }

    //    public void displayChart() {
//        //6,7,3,2,5
//        for (int number : numbers) {
//            //number 6
//            for (int i = 0; i < number; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;

    public void collectNumbers() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number ");
            if (i == 0) {
                num1 = input.nextInt();
            }

            if (i == 1) {
                num2 = input.nextInt();
            }
            if (i == 2) {
                num3 = input.nextInt();
            }
            if (i == 3) {
                num4 = input.nextInt();
            }
            if (i == 4) {
                num5 = input.nextInt();
            }
        }
    }

    public void displayChart() {
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < num5; i++) {
            System.out.print("*");
        }
    }
}
