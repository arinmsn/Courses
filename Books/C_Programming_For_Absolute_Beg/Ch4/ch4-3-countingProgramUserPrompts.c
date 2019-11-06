#include <stdio.h>

int main()
{
    int iBeginNum = 0;
    int iEndNum = 0;
    int iIncrement = 0;
    int x = 0;
    int y = 0;
    char cEnter = '\0';
    
    printf("User-defined Countdown\n");
    printf("Please, enter the number from which we will start the counter: ");
    scanf("%d", &iBeginNum);
    printf("Enter the end number that we will be counting toward: ");
    scanf("%d", &iEndNum);
    printf("Enter the counter's increment value: ");
    scanf("%d", &iIncrement);
    printf("\nWe will start at %d, and end with %d. Number will be incremented by %d\n", iBeginNum, iEndNum, iIncrement);
    
    if (iBeginNum < iEndNum){
        for (x = iBeginNum; x < iEndNum; x += iIncrement){
            iBeginNum += iIncrement;
            if (iBeginNum > iEndNum){
                printf("\nUnable to increment last number.\nEnd number is %d", iEndNum);
                break;
            }
            printf("\nCounter: %d", iBeginNum);
        }
    } else if (iBeginNum > iEndNum) {
        for (y = iBeginNum; y > iEndNum; y -= iIncrement){
            iBeginNum -= iIncrement;
            if (iBeginNum < iEndNum) {
                printf("\nUnable to increment last number.\nEnd number is %d", iEndNum);
                break;
            }
            printf("\nCounter: %d", iBeginNum);
        }
    } else if (iBeginNum == iEndNum){
        printf("\nBeginning and end numbers are the same!");
    }
    printf("\nThank you for using the counter app!");
    return 0;
} //end main function
