#include <stdio.h>

int main()
{
    int iDice1 = 0;
    int iDice2 = 0;
    int iSumDices = 0;
    
    printf("\nThe Dice Game\nIf sume of the two dices totals 7 and 11, you win.\n");
    printf("\nDice 1: %d\tDice 2: %d", iDice1, iDice2);
    
    srand(time());
    iDice1 = ((rand() % 6) + 1);
    iDice2 = ((rand() % 6) + 1);
    iSumDices = iDice1 + iDice2;
    
    if ((iSumDices == 7) || (iSumDices == 11)) {
        printf("You won the game. Dice 1 was %d and Dice 2 was %d. Sum is %d.", iDice1, iDice2, iSumDices);
    } else {
        printf("You lost! Thank you for playing. Dice 1 was %d and Dice 2 was %d. Sum is %d.", iDice1, iDice2, iSumDices);
    }

    return 0;
} // end of main function
