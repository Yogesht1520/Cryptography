import java.util.Scanner;
public class monoalphabeticcipher 
{
    public static void main(String[] args) 
    {
        char[] plaintext = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] cipherbase = {'z','c','q','e','w','a','x','y','r','k','f','t','j','g','u','b','l','m','n','o','v', 'p', 'h', 'i', 'd', 's'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be encrypted:");
        String input = scanner.nextLine().toLowerCase(); 
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) 
            {
                int index = new String(plaintext).indexOf(ch);
                ciphertext.append(cipherbase[index]);
            }
            else 
	        {
                ciphertext.append(ch);
            }
        }
        System.out.println("Encrypted message: " + ciphertext.toString());
        scanner.close();
    }
}