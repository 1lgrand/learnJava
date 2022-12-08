package Basic_Instructions;

public class ifConditions {
    //Now we are going to se If condition
    //If conditions can be nested or waterfall
    //With if conditions we go to check something

    //Let's start

    public static void main(String... args) {
        int a = 100;

        //WARNING: Use == because = is an assignment operator!
        //Nested Condition: We verify a condition only if another is verified
        //Waterfall: We verify a condition regardless of the previous

        //Nested
        if (a == 100) {
            System.out.println("A IS EQUAL TO 100! ");
        } else {
            if (a == 200) {
                System.out.println("YES A IS EQUAL TO 200, WOW");
            }
        }

        //Waterfall
        if (a >= 200) {
            System.out.println("A is bigger then 200");
        } else {
            System.out.println("A is under 200");
        }
    }


    // Go in Exercises and do ex3 and ex4
}
