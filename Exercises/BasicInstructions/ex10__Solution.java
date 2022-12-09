package Exercises.BasicInstructions;

import java.util.Scanner;

public class ex10__Solution {

    public static void main(String...args){

        int a,b;
        int mul = 0;
        Scanner in  = new Scanner(System.in);

        System.out.println("What number do you want to moltiplicate?");
        a = in.nextInt();

        System.out.println("How many times? ");
        b = in.nextInt();

        for(int i = 0;i< b;i++){
            mul += a;
        }

        System.out.printf("%d * %d = %d",a,b,mul);


    }


}
