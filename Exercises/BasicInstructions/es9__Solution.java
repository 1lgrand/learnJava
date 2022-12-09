package Exercises.BasicInstructions;

import java.util.Scanner;

public class es9__Solution {

    public static void main(String...args){

        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            System.out.println("Write n: ");
            n = in.nextInt();
            sum += n; //Operator += stands for sum = sum + n
        }while (n != 0); //Not Equal operator

        System.out.println(sum);


    }

}
