#include <stdio.h>
int main(void){
	char c = 65; // ASCII for 'A'
	char A ='A';
    signed char x = -128;
    unsigned char y = 255;
    int z = x + 129;
    printf("As number: %d, As character: %c\n", A, A);
    printf("As number: %d, As character: %c\n", c, c);
    printf("Signed char: %d\nUnsigned char: %d\n", x, y);
	printf("printing signed as unsigned int %u\n",x); //4294967168  --> (11111111 11111111 11111111) 10000000
    printf("Using char in arithmetics: %d\n", z);
    return 0;
}