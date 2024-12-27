#include <stdio.h>

int main() {
    char str[] = "Hello World";
    int i = 0;

    printf("Original string: %s\n", str);
    printf("XOR with 0 result: ");
    
    while (str[i] != '\0') {
        char xorChar = str[i] ^ 127; // XOR each character with 0
        printf("%c", xorChar);     // Print the result
        i++;
    }
    
    printf("\n");

    return 0;
}
