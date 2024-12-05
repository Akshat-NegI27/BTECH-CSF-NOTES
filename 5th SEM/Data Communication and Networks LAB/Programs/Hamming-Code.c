#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
    int MaxLength;
    int length;
    int parity;
    char *HammingString=NULL;
    void EnterParameters(int *length, int *parity)
    {
        printf("Enter the maximum length: ");
        scanf("%d", length);
        printf("Enter the parity (0=even, 1=odd): ");
        scanf("%d", parity);
    }
    void CheckHamming(char *HammingString, int parity)
    { 
        int i, j, k, start, length, ParityNumber; 
        printf("Enter the Hamming code: ");
        scanf("%s", HammingString);
        int ErrorBit = 0;                        
        length = strlen(HammingString);          
        length--;
        if (length > MaxLength)
        {
            printf("\n** Invalid Entry - Exceeds Maximum Code Length of %d\n\n", MaxLength);
            return;
        }
        ParityNumber = ceil(log(length)/log(2)); 
        for(i = 0; i < ParityNumber; i++)
        {
            start = pow(2, i);
            int ParityCheck = parity; 
            for(j = start; j < length; j=j+(2*start))
            {
                for(k = j; (k < ((2*j) - 1)) && (k < length); k++)
                {
                    ParityCheck ^= (HammingString[length - k] - '0');
                }
            } 
                ErrorBit = ErrorBit + (ParityCheck * start);  
            }
        if(ErrorBit == 0)
        {
            printf("No error \n");
        }
        else
        {
            printf("There is an error in bit: %d\n", ErrorBit);
            if(HammingString[length - ErrorBit] == '0')
            {
                HammingString[length - ErrorBit] = '1';
            } 
            else 
            {
                HammingString[length - ErrorBit] = '0';
            }
            printf("The corrected Hamming code is: %s \n", HammingString);
        } 
    }
    int main()
    {
        int parity; 
        int choice = 0; 
            printf("Error detection/correction: \n");
            printf("----------------------------\n");
            printf("1) Enter parameters \n");
            printf("2) Check Hamming code \n");
            printf("3) Exit \n");
            printf("\nEnter selection: ");
            scanf("%d", &choice);
            while (choice != 3)
            {
                if (choice == 1)
                {
                    EnterParameters(&MaxLength, &parity);
                    HammingString = (char*) malloc (MaxLength * sizeof(char));
                    main();
                }
                else if (choice == 2)
                {
                    CheckHamming(HammingString, parity);
                    main();
                }
                else 
                {
                    printf("Valid options are 1, 2, or 3. Quitting program. \n");
                    exit(0);
                }     
            }
            exit(0);
	}