package Basic_Instructions;


// A loop is a repetition of an instruction or a set of instructions
// For example, if we want to say our name 10 times or until a certain condition is satisfied
//There are 3 types of loops, precondition, post-conditional and the for loop

// Precondition, checks a condition before entering the loop,
// PostConditional, check the condition after at least one cycle of loop
// For Loop, this is used for loops with a counter

public class loops {

    public static void main(String...args){

        //Pre conditional loop
        int a = 0;
        //In this case the condition is a<10
        while (a < 10){
            System.out.println(a);
            a++;
        }

        char b = 'a';

        //Post conditional
        do{
            System.out.println(b);
            b++;
        }while (b != 'o');

        //Now for loop
        //As i said, we need a counter
        //Counters are called indexes, and conventionally they are i,j,k ...
        //Examples of a for loop

        // The syntax is for(<initialization>,<condition>,<increment>)
        for(int i = 0; i < 10;i++){
            System.out.printf("<%d> Hi, i'm Druv\n",i);
        }

        //Exercise 8,9,10,11
        // This is the last argument of BasicIstructions -- so do ex12, a project with everything of this Chapter

    }





}
