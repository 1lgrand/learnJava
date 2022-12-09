package Exercises.BasicInstructions;

import java.util.Scanner;

public class Ex7__Solution {
    public static void main(String...args){

        final double PI = 3.14d;
        double circ1,circ2;
        int r;
        Scanner in = new Scanner(System.in);

        System.out.println("Radius circle 1: ");
        r = in.nextInt();
        circ1 = PI*Math.pow(r,2);

        System.out.println("Radius circle 2: ");
        r = in.nextInt();
        circ2 = PI*Math.pow(r,2);

        System.out.println("Area of c1: " + circ1);
        System.out.println("Area of c2: " + circ2);

        if(circ1 > circ1){
            System.out.println("Area of c1 is bigger, the difference is " + Math.round(circ1-circ2));

        }else{
            System.out.println("Area of c2 is bigger ,the difference is " + Math.round(circ1-circ2));
        }


    }
}
