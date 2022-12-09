package Exercises.BasicInstructions;

import java.util.Scanner;

public class es12__Solution {

    public static void main(String...args){

        final int PIN = 1234;
        final double PI = 3.14d;
        Scanner in = new Scanner(System.in);
        int usrPin;
        int choose;
        double a,b,r,area;

        do {
            System.out.println("Write pin: ");
            usrPin = in.nextInt();
        }while (PIN != usrPin);

        do{

            System.out.println("<1> Calculate area of circle");
            System.out.println("<2> Calculate area of triangle");
            System.out.println("<0> QUIT");

            System.out.println("\t\tWhat do you want? ");
            choose = in.nextInt();

            if(choose == 1){
                System.out.println("Radius: ");
                r = in.nextInt();
                area = PI + Math.pow(r,2);

                System.out.println("Area of circle: " + area);

            }else if(choose == 2){
                System.out.println("Base: ");
                a = in.nextInt();
                System.out.println("Height: ");
                b = in.nextInt();

                area = (a*b)/2;

                System.out.println("Area of triangle: " + area);

            }else if( choose != 1 && choose != 2 && choose != 0){
                System.out.println("Invalid Input");
            }

        }while (choose != 0);

        System.out.println("Program ended");

    }


}
