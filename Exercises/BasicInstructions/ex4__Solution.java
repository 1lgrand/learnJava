package Exercises.BasicInstructions;

public class ex4__Solution {

    public static void main(String...args){
        float price = 130.0f;
        final float DISCOUNT = 30f; //Use final Keyword for costants, Number we cannot change during the execution of our program

        if(price >= 100){
           float newPrice = price - (price/100)*DISCOUNT;
           System.out.println(newPrice);
        }else{
            System.out.println(price);
        }
    }

}
