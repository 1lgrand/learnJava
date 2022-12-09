package Exercises.BasicInstructions;
import java.util.Scanner;



public class ex6__Solution {

    public static void main(String...args){
        Scanner in = new Scanner(System.in);

        int c1,c2;
        double hyp;

        System.out.println("Insert Cathete 1: ");
        c1 = in.nextInt();

        System.out.println("Insert Cathete 1: ");
        c2 = in.nextInt();

        hyp = (Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2)));

        //Rounding two decimals
        //I did a casting operation, because the round function return a long number
        //so i "converted" the long value to double
        hyp = (double) Math.round(hyp*100)/100;

        System.out.println("Result is: " + hyp);



    }

}
