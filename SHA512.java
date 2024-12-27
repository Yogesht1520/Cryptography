import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA512
{
    public static String getSHA512Hash(String input)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] MessageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, MessageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length()< 32)
            {
                hashtext = "0"+hashtext;
            }
            return hashtext;

        }
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void main(String []args) throws NoSuchAlgorithmException
    {
    String s = "Bye World";
    System.out.println("Hash code generated for string is-"+getSHA512Hash(s));
    }
}
