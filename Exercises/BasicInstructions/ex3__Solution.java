package Exercises.BasicInstructions;

public class ex3__Solution {
    public static void main(String...args){
        int x = 210;
        int y = 50;
        int z = 40;


        if (x > y){
            if(x > z){
                System.out.println("X is bigger then Y and Z");
            }else{
                if(z > y){
                    System.out.println("Z is bigger then X and Y");
                }
            }
        }else if(y > z){
                System.out.println("Y is bigger then X and Z");
            }else if(z > y){
            System.out.println("Z is bigger then X and Y");
            }else if (x == y && x == z){
            System.out.println("ALL NUMBERS ARE THE SAME");
        }
    }
}
