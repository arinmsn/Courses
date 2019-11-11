#include <stdio.h>

int iGetRemainder(int, int);
int iGetMaxNumber(int, int);
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
        printf("\nMake a selection\n");
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
        }
    } while (iSelect !=4); //end of do/while
}//end of main()


/*****************************
 Function Definition
 iGetRemainder
*****************************/

int iGetRemainder(int iNumerator, int iDenominator)
{
    return (iNumerator % iDenominator);
}

/*****************************
 Function Definition
 iGetMaxNumber
*****************************/

int iGetMaxNumber(int iNumOne, int iNumTwo)
{
    if(iNumOne < iNumTwo)
        return iNumTwo;
    else if(iNumOne > iNumTwo)
        return iNumOne;
    else if(iNumOne == iNumTwo){
        printf("Both numbers are equal!");
        return iNumOne;
    }
}

/*****************************
 Function Definition
 printMenu
*****************************/

void printMenu(void){
    printf("\n--------------- ATM ---------------");
    printf("\n");
    printf("\n");
    printf("\n      Gringotts Wizarding Bank ");
    printf("\n");
    printf("     Please, insert your debit card");
}
