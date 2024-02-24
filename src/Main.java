
import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int factor) {

        //check for number 2 or less
        if (number <= 2) return (number == 2) ? true : false;
        //checking for factors
        if (number % factor == 0) return false;
        //base case - composite numbers cannot have more factors than or equal to its square root
        if (factor * factor > number) return true;
        // recursive
        return isPrime(number, factor + 1);
    }


    public static void main(String[] args) {
        //variable and scanner initializations
        int number;
        Scanner scanner = new Scanner(System.in);
        //user input
        System.out.println("Enter a number to find out if it is a prime number or not: ");
        number = scanner.nextInt();

        //print the result to the user calling the recursive method
        System.out.println(isPrime(number, 2) ? number + " is a prime number." : number + " is not a prime number.");
    }
}