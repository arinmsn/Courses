#include <stdio.h>

float fgetRemainder(int, int);
float fMaxNumber(int, int);
void printMenu(void);

int main()
{
    int iSelect = 0;
    int iNumerator = 0;
    int iDenominator = 0;
    int iResult = 0;
    int iFirstNum = 0;
    int iSecondNum = 0;
    int iMaxNum = 0;
    
    do {
        printf("Make a selection");
        printf("\n\n1. Show ATM menu\n\n2. Find remainder of two numbers\n\n3. Choose the largest number of two numbers\n\n4. Exit!\n\n");
        scanf("%d", &iSelect);
        
        switch(iSelect){
            case 1:
                printMenu();
                break;
            case 2:
                printf("\nEnter the numerator here: ");
                scanf("%d", &iNumerator);
                printf("\nEnter Your denumerator here: ");
                scanf("%d", &iDenominator);
                iResult = iGetRemainder(iNumerator, iDenominator);
                printf("\nThe remainder is %d\n", iResult);
                break;
            case 3:
                printf("Enter first number: ");
                scanf("%d", &iFirstNum);
                printf("Enter the second number: ");
                scanf("%d", &iSecondNum);
                iMaxNum = fMaxNumber(iNumerator, iDenominator);
                printf("\nThe largest number you entered is %d ", iMaxNum);
                break;
    } while (iSelect !=4); //end of do/while
}//end of main()
