#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// Returns XOR of 'a' and 'b' (both of same length)
char* xor1(char* a, char* b) {
    int n = strlen(b);
    char* result = (char*)malloc(n + 1);
    result[n] = '\0';

    for (int i = 0; i < n; i++) {
        if (a[i] == b[i]) {
            result[i] = '0';
        } else {
            result[i] = '1';
        }
    }

    return result;
}

// Performs Modulo-2 division
char* mod2div(char* dividend, char* divisor) {
    int pick = strlen(divisor);
    int n = strlen(dividend);
    char* tmp = (char*)malloc(n + 1);
    tmp[n] = '\0';

    while (pick < n) {
        strncpy(tmp, dividend, pick);
        tmp[pick] = '\0';

        if (tmp[0] == '1') {
            tmp = xor1(divisor, tmp);
            tmp[pick] = dividend[pick];
        } else {
            tmp = xor1(tmp, tmp);
            tmp[pick] = dividend[pick];
        }

        pick++;
    }

    if (tmp[0] == '1') {
        tmp = xor1(divisor, tmp);
    } else {
        tmp = xor1(tmp, tmp);
    }

    return tmp;
}

// Function used at the sender side to encode data by appending remainder of modular division at the end of data   

void encodeData(char* data, char* key) {
    int l_key = strlen(key);   

    int n = strlen(data);
    char* appended_data = (char*)malloc(n + l_key);
    strcpy(appended_data, data);
    memset(appended_data + n, '0', l_key);
    appended_data[n + l_key] = '\0';

    char* remainder = mod2div(appended_data, key);
    int codeword_len = n + l_key;
    char* codeword = (char*)malloc(codeword_len + 1);
    strncpy(codeword, data, n);
    strcpy(codeword + n, remainder);
    codeword[codeword_len] = '\0';

    printf("Remainder: %s\n", remainder);
    printf("Encoded Data (Data + Remainder): %s\n", codeword);

    free(appended_data);
    free(remainder);
    free(codeword);
}

// checking if the message received by receiver is correct or not. If the remainder is all 0 then it is correct, else wrong.
void receiver(char*   
 data, char* key) {
    int key_size = strlen(key);
    int n = strlen(data);
    char* currxor = (char*)malloc(n + 1);
    currxor[n] = '\0';

    strncpy(currxor, data, key_size);
    int curr = key_size;

    while (curr != n) {
        if (strlen(currxor) != key_size) {
            currxor[curr++] = data[curr];
        } else {
            currxor = mod2div(currxor, key);
        }
    }

    if (strlen(currxor) == key_size) {
        currxor = mod2div(currxor, key);
    }

    if (strchr(currxor, '1') != NULL) {
        printf("There is some error in data\n");
    } else {
        printf("Correct message received\n");
    }

    free(currxor);
}

// Driver code
int main() {
    char data[] = "100100";
    char key[] = "1101";

    printf("Sender side...\n");
    encodeData(data, key);

    printf("\nReceiver side...\n");
    receiver(data, key);

    return 0;
}