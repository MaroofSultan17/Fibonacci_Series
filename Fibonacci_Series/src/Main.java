//Write a Program that calculate the Fibonacci_Series
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the last number : ");  // user can input the number to find the Fibonacci_Series
        Input = sc.nextInt();       // Parsing and input
       int n1=0, n2=1, n3;          // we know 0 and 1 should b 0 and 1 in Fibonacci_Series so n3 var is used to  sum the series
        System.out.print(n1+" "+n2);    //Print the value of n1 abd n2
        for (int i=2; i<Input; i++)     //for loop is used to find the Fibonacci_Series from 0 to enter the user input value
        {
            n3=n1+n2;       //sum the n1 and n2
            System.out.print(" "+ n3);
            n1=n2;              // assign the value of n2 to n1
            n2=n3;              // assign the value of n3 to n2
        }
    }
}