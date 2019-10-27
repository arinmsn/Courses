#include <stdio.h>

int main()
{
    int iRandomNum = 0;
    int iResponse = 0;
    iRandomNum = (rand() % 10) + 1;
    srand(time());
    
    printf("Please, guess a number between 1 to 10: ");
    scanf("%d", &iResponse);
    
    if ( (iResponse >=1) && (iResponse <= 10) && (isdigit(iResponse) == 0)){
        if (iResponse == iRandomNum) {
            printf("\nYou were correct! The right number is %d", iRandomNum);
        } else {
            printf("\nSorry, you guess the wrong number.");
            printf("\nThe correct guess was %d\n", iRandomNum);
        }  
    } else {
        printf("\nYou did not enter a digit between 1-10!");
    }
    
    return 0;
    
} // end main function
