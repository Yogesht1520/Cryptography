import java.util.Scanner;
import java.util.*;
class CaesarCipher
{
	public static StringBuffer encrypt(String text, int s)
	{
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < text.length(); i++)
		{
			if (Character.isUpperCase(text.charAt(i)))
			{
				char ch = (char) (((int)text.charAt(i) + s - 65) % 26 + 65);
				result = result.append(ch);
			}
			else
			{
				char ch = (char) (((int)text.charAt(i) + s - 97) % 26 + 97);
				result = result.append(ch);
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		String text;
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();

		int s = 3;
		System.out.println("Text- "+text);
		System.out.println("key- "+s);
		System.out.println("Ciphertext- "+encrypt(text, s));
	}
}
