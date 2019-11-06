// Counts down 100, 90, 80, ..., 30, 20, 10
#include <stdio.h>

int main()
{
    int iNum = 100;
    do{
        printf("\n%d", iNum);
        iNum -= 10;
    } while (iNum > 1);
    return 0;
} //end main function
