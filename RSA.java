import java.util.*;
import java.io.*;
import java.math.*;
public class RSA {
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
    public static void main(String []args)
    {
        double p = 7;
        double q = 5;
        double n = p * q;
        double e = 3;
        double phi = (p-1) * (q-1);
        while (e < phi)
        {
            if (gcd(e, phi) == 1)
            {
                break;
            }
            else
            {
                e++;
            }
        }
        int k = 2;
        double d = (1 + (k * phi)) / e;
        double m = 12;
        System.out.println("Message = "+m);
        double C = Math.pow(m, e);
        C = C % n;
        System.out.println("Encrypted msg = " +C);
        double P = Math.pow(C, d);
        P = P % n;
        System.out.println("original message = "+P);
    }
}
