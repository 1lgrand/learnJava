package Basic_Instructions;

//In the previous examples we used "Known" variables
//Now we have to choose from the keyboard what value we want to insert in our variable
//We use the Scanner Library (Is possible with other libs too)
//For use a library use the keyword -- import --
// --> A library is another code, where there are some funcitons or datatypes

//In java.util... we can find a lot of useful libraries...
import java.util.Scanner;
public class UserInput {
    public static void main(String...args){

        //We have to create our scanner
        //Later we are going to understand why we are writing like this...
        //We are creating a New scanner, we use the stdin stream to read values we want use from our keyboard
        Scanner in = new Scanner(System.in);

        //Let's try to insert a number and print if it is bigger then another or not
        System.out.println("Write a number: ");
        int a = in.nextInt(); //Use nextInt because the type of a is int

        System.out.println("Write another number");
        int b = in.nextInt();

        if(a>b){
            System.out.println("A BIGGER THEN B");
        }else if(a == b){
            System.out.println("A AND B ARE EQUALS");
        }else{
            System.out.println("B IS BIGGER THEN A");
        }

        // [?] What if you write a letter instead of a number?
            //You are going to generate an Exeption...

        //Ex 5,6,7



    }
}
