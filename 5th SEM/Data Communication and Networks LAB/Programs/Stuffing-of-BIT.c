#include <stdio.h>
#include <string.h>

int main() 
{
    char stuff[100];
    int i, count = 0;

    printf("Enter the BIT--> ");
    scanf("%s", stuff);

    printf("Bit-stuffed--> ");
    for (i = 0; stuff[i] != 0; i++) 
    {
        printf("%c", stuff[i]);

        if (stuff[i] == '1') 
        {
            count++;
            if (count == 5) 
            {
                printf("0");
                count = 0;
            }
        } 
        else 
        {
            count = 0;
        }
    }
    printf("\n");
    return 0;
}