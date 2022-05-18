import java.util.Random;

/*
For Loop 04
Exercise: For Loop 4

define a class CustomNumber that has:
an instance variable called number
a constructor that generates and prints a random number between 1 and 12 and assigns it to number
a method called getMultiplicationTable that prints all the multiplication table for number in descending order (from 12 to 1)
 */
public class CustomNumber {
    int number;
    public CustomNumber(){
        this.number = new Random().nextInt(1,13);
        System.out.println("The value of number is: "+number);
    }
    public void getMultiplicationTable(){
        for (int i=number; i>0; i--){
            System.out.print((i*2)+", " );
        }
    }
}
