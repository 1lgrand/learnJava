package Exercises.BasicInstructions;

import java.util.Scanner;

public class ex11__Solution {

    public static void main(String...args){

        Scanner in = new Scanner(System.in);
        int t;

        System.out.println("How many times do you want to repeat? ");
        t = in.nextInt();


        for(int i = 0; i<=t ;i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
