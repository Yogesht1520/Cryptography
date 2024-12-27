import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class SubstitutionCipher
{
		public static void main(String[] args)
	{
		String allletters = "abcdefghijklmnopqrstuvwxyz"+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Character, Character> dict1 = new HashMap<>();
		int key = 4;
		for(int i = 0; i < allletters.length(); i++)
		{
			dict1.put(allletters.charAt(i), allletters.charAt((i+key) % allletters.length()));
		}
		String plaintext = "I am studying data encryption";
		StringBuilder ciphertext = new StringBuilder();
		for(char c: plaintext.toCharArray())
		{
			if(allletters.indexOf(c) != -1)
			{
				ciphertext.append(dict1.get(c));
			}
			else
			{
				ciphertext.append(c);
			}
		}
		System.out.println("CipherText is: "+ ciphertext);
		Map<Character, Character> dict2 = new HashMap<>();
		for(int i = 0; i < allletters.length(); i++)
		{
			dict2.put(allletters.charAt(i), allletters.charAt((i - key + allletters.length()) % allletters.length()));
		}
		StringBuilder decryptedtext = new StringBuilder();
		for(char c : ciphertext.toString().toCharArray())
		{
			if(allletters.indexOf(c) != -1)
			{
				decryptedtext.append(dict2.get(c));
			}
			else
			{
				decryptedtext.append(c);
			}
		}
		System.out.println("Recovered plaintext: " + decryptedtext);
	}
}