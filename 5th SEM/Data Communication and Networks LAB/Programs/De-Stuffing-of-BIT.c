#include <stdio.h>
#include <string.h>

int main() {
    char data[100], dest[100];
    int i, j, count = 0;

    printf("Enter the BIT--> ");
    scanf("%s", data);

    printf("Bit De-stuffed--> ");
    for (i = 0, j = 0; data[i] != 0; i++) 
    {
        if (data[i] == '1') 
        {
            count++;
            if (count == 5 && data[i + 1] == '0') 
            {
                count = 0;
                i++;
            }
        } 
        else 
        {
            count = 0;
        }
        dest[j++] = data[i];
    }
    dest[j] = '\0';
    printf("%s\n", dest);

    return 0;
}