package Basic_Instructions;
//Now we are going to see some basic datatypes
//In Java thare are <>  primary data types
/*

byte --> Stores 1 Byte (8 bits) in RAM, so we can represent 255 numbers (-128 to 127)
short --> Stores 2 Bytes (16 bits) in Memory, so we have 65.536 numbers
int --> Stores 4 Bytes (32 bits) in Memory, so we have 2^32 possible numbers
long --> Stores 8 Bytes (64 bits) in Memory, so we have 2^64 possible numbers
float --> Real number with comma, stores 32 Bits, Standard IEEE 754
double --> Is like float, but stores 64 bit, so it is more precise
boolean --> It use 1 bit (1 and 0) we use it to check if a condition is true or false
char --> It represents a character

String --> Is a particular type of datatype, we will see it later

 */
public class dataTypes {

    public static void main(String...args){
        byte nNumber = 125;
        System.out.println("Your byte number: " + nNumber);

        int IntNumber = 233;
        System.out.println("Your int number: " + IntNumber);

        float floatNumber = 233.4f; //When we are Initializing a float varible we put f at the end
        System.out.println("Your float number: " + floatNumber);

        double doubleNumber = 31234.32212d; //Same with double
        System.out.println("Your double number: " + doubleNumber);

        boolean flag = true;
        System.out.println("Your flag value: " + flag);

        char character = 'a';
        System.out.println("Your character: " + character);

    }



}
