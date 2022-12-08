package Basic_Instructions;

/*
* Obviously there are some basic math operators:
* <+> for addition
* <-> for subtraction
* </> for division
* <*> for moltiplication
* <%> for module
* <++> Increment operator
* <--> Decrement operator
* <&&> Logical and operator
* <!> Logical not operator
* <||> Logical or
* */

public class operators {
    public static void main(String...args){
        //Let's start with some basic math
        int a = 0;
        int b = 10;

        a = a+b;
        System.out.println("addition " + a); // Should be 10

        int c = 5;

        a = a-c;
        System.out.println("subtraction "+a); //Should be 5

        b = 4;
        a = a*b;
        System.out.println("Moltiplication "+a); //Should be 20

        c = 2;
        a = a/c;
        System.out.println("division "+a); //Should be 10

        System.out.println("Increment "+a++); // It is like a = a + 1 so now is 11
        System.out.println("Decrement "+a--); // It is like a = a - 1 so now is 10

        // Go in Exercises and do ex2

    }
}
