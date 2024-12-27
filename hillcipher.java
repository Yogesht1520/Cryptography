import java.util.Scanner;
public class hillcipher {

    public static int[] matrixMultiplication(int[][] keyMatrix, int[] plaintextVector) {
        int[] resultVector = new int[2];
        for (int i = 0; i < 2; i++) {
            resultVector[i] = 0;
            for (int j = 0; j < 2; j++) {
                resultVector[i] += keyMatrix[i][j] * plaintextVector[j];
            }
        }
        return resultVector;
    }

    public static int[] applyModulo(int[] vector) {
        int[] modVector = new int[2];
        for (int i = 0; i < 2; i++) {
            modVector[i] = vector[i] % 26;
            if (modVector[i] < 0) {
                modVector[i] += 26;
            }
        }
        return modVector;
    }

    public static int charToInt(char c) {
        return (c - 'A');
    }

    public static char intToChar(int i) {
        return (char)(i + 'A');
    }

    public static String encryptBlock(int[][] keyMatrix, String block) {
        int[] plaintextVector = new int[2];
        plaintextVector[0] = charToInt(block.charAt(0));
        plaintextVector[1] = charToInt(block.charAt(1));

        int[] multipliedVector = matrixMultiplication(keyMatrix, plaintextVector);

        int[] ciphertextVector = applyModulo(multipliedVector);

        StringBuilder ciphertext = new StringBuilder();
        ciphertext.append(intToChar(ciphertextVector[0]));
        ciphertext.append(intToChar(ciphertextVector[1]));

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] keyMatrix = new int[2][2];
        System.out.println("Enter 2x2 key matrix (4 integers between 0 and 25):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                keyMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter plaintext: ");
        String plaintext = scanner.next().toUpperCase();

        if (plaintext.length() % 2 != 0) {
            plaintext += "X";
        }

        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i += 2) {
            String block = plaintext.substring(i, i + 2);
            ciphertext.append(encryptBlock(keyMatrix, block));
        }

        System.out.println("Ciphertext: " + ciphertext.toString());

        scanner.close();
    }
}
