#include <stdio.h>

int main()
{
    int iNumQuestion = 0;
    int iInc = 1;
    int iRandomNum1 = 0;
    int iRandomNum2 = 0;
    int iCorrectAnswer = 0;
    int iAnswere = 0;
    int iCalculate = 0;
    
    srand(time(NULL));
    
    printf("\nMath Quiz\nHow many questions would you like to answere? ");
    scanf("%d", &iNumQuestion);
    
    while (iInc <= iNumQuestion){
        int iRandomNum1 = (rand() % 10);
        int iRandomNum2 = (rand() % 10);
        iCalculate = (iRandomNum1 * iRandomNum2);
        printf("\nQuestion %d: What is %d x %d? ", iInc, iRandomNum1, iRandomNum2);
        scanf("%d", &iAnswere);
        
        if (iAnswere == iCalculate){
            printf("Correct!");
            iCorrectAnswer++;
        } else {
            printf("Incorrect!");
        }
        iInc++;
    }
    printf("\nYou answered %d correct answers out of %d questions.", iCorrectAnswer, iNumQuestion);
    
    return 0;
} //end main function
