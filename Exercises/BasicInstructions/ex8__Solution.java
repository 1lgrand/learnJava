package Exercises.BasicInstructions;

import java.util.Scanner;

public class ex8__Solution {
    public static void main(String...args){

        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Write number: ");
        n = in.nextInt();

        for(int i = 0;i<=n;i++){
            System.out.println(i);
        }


    }
}
