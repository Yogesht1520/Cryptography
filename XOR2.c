#include <stdio.h>

int main() {
    char str[] = "Hello World";
    int i;

    printf("Original string: %s\n", str);

    printf("AND with 127 result: ");
    for (i = 0; str[i] != '\0'; i++) {
        char andChar = str[i] & 127; 
        printf("%c", andChar);       
    }
    printf("\n");

    printf("OR with 127 result: ");
    for (i = 0; str[i] != '\0'; i++) {
        char orChar = str[i] | 127;  
        printf("%c", orChar);        
    }
    printf("\n");

    printf("XOR with 127 result: ");
    for (i = 0; str[i] != '\0'; i++) {
        char xorChar = (str[i] ^ 127) ^ 127; 
        printf("%c", xorChar);       
    }
    printf("\n");

    return 0;
}
