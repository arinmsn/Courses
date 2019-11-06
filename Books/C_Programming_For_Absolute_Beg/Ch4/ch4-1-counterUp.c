// This will print 1, 6, 11, ..., 86, 91, 96
//#include <stdio.h>

//int main()
//{
//    int iNum;
//    for (iNum = 1; iNum <= 100; iNum += 5){
//        printf("\n%i", iNum);
//    }
//    return 0;
//} //end main function

#include <stdio.h>

int main()
{
    int iNum = 5;
    printf("\n1");
    do{
        printf("\n%d", iNum);
        iNum += 5;
    } while (iNum < 100);
    return 0;
} //end main function
