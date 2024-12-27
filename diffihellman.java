import java.io.*;
import java.util.Scanner;
//ask user to enter prime
//check whether it is prime

//use input a and as it is primitive
//gcd should be 1 for the same

//select private key less than q

public class diffihellman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a prime number: ");
       int p = scanner.nextInt();
       if (!isPrime(p)) {
           System.out.println("The input number is not prime.");
           return;
       }
       System.out.print("Enter a primitive root: ");
       int g = scanner.nextInt();
       System.out.print("Enter Alice's secret number: ");
       int a = scanner.nextInt();
       System.out.print("Enter Bob's secret number: ");
       int b = scanner.nextInt();
       int A = (int) Math.pow(g, a) % p;
       int B = (int) Math.pow(g, b) % p;
       int K_A = (int) Math.pow(B, a) % p;
       int K_B = (int) Math.pow(A, b) % p;
       System.out.println("Alice's shared key: " + K_A);
       System.out.println("Bob's shared key: " + K_B);
   }
   public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (gcd(i, n) != 1) {
            return false;
        }
    }
    return true;
    }
    public static double gcd(double a, double h)
    {
        while (h!=0)
        {
            double temp = h;
            h = a % h;
            a = temp;
        }
        return a;
    }
    }
    