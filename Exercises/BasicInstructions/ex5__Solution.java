package Exercises.BasicInstructions;

import java.util.Scanner;

public class ex5__Solution {
    public static void main(String...args){

        Scanner in = new Scanner(System.in);
        float sum,avg;
        int n1,n2,n3,n4;

        System.out.println("write n1: ");
        n1 = in.nextInt();

        System.out.println("write n2: ");
        n2 = in.nextInt();

        System.out.println("write n3: ");
        n3 = in.nextInt();

        System.out.println("write n4: ");
        n4 = in.nextInt();

        //Finiding sum
        sum = n1+n2+n3+n4;
        System.out.println("Sum: " + sum);
        //Find avg
        avg = sum/4;
        System.out.println("avg: " + avg);

        //Largest with logic operators
        if (n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("N1 IS BIGGER");
        }else if (n2 > n1 && n2 > n3 && n2 > n4){
            System.out.println("N2 IS BIGGER");
        }else if(n3 > n1 && n3 > n2 && n3 > n4){
            System.out.println("N3 IS BIGGER");
        }else if(n4 > n1 && n4>n2 && n4 > n3){
            System.out.println("N4 IS BIGGER");
        }else{
            System.out.println("All numbers are the same");
        }



    }
}
