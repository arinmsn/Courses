#include <stdio.h>
#include <stdlib.h>

int main()
{
    int iSelect = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int iCurrentTime = 0;
    int iElapsedTime = 0;
    int iTimeWentBy = 0;
    int iResp1 = 0;
    int iResp2 = 0;
    int iResp3 = 0;
    int iResp4 = 0;
    int iResp5 = 0;
    
    srand(time(NULL));
    
    do {
            printf("\n\tThe Concentration Game Version 2.0\n");
            printf("\nMenu (please, select difficulty):\n\n1 Easy (remember 3 numbers in 5 seconds)");
            printf("\n\n2 Intermediate (remember 5 numbers in 5 seconds)\n\n3 Difficult (remember 5 numbers in 2 seconds)\n\n4 Quit\n\n");
            scanf("%d", &iSelect);
    
            if(iSelect == 4) {
    
                break;
            }
    
            i1 = rand() % 100;
            i2 = rand() % 100;
            i3 = rand() % 100;
    
            printf("\nConcentrate on the next numbers!");
            printf("\n%d\t%d\t%d", i1, i2, i3);
    
            iTimeWentBy = 5;
    
            if(iSelect == 2 || iSelect == 3) {
    
                    i4 = rand() % 100;
                    i5 = rand() % 100;
    
                    printf("\t%d\t%d", i4, i5);
    
    
            }
    
            if(iSelect == 3) {
                    iTimeWentBy = 3;
            }
    
            printf("\n");
            iCurrentTime = time(NULL);
    
            do {
    
                iElapsedTime = time(NULL);
    
            } while ((iElapsedTime - iCurrentTime) < iTimeWentBy); //end do/while loop
    
            system ("clear");
    
            printf("\nEnter each # separated with one space: ");
            scanf("%d%d%d", &iResp1, &iResp2, &iResp3);
    
            if(iSelect == 2 || iSelect == 3) {
    
                    scanf("%d%d", &iResp4, &iResp5);
    
            }
    
            if (i1 == iResp1 && i2 == iResp2 && i3 == iResp3 && i4 == iResp4 && i5 == iResp5) {
    
                    printf("\nCongratulations! All numbers were correct!\n");
    
            } else {
    
                    printf("\nSorry, correct numbers were %d %d %d", i1, i2, i3);
    
                    if(iSelect == 2 || iSelect == 3) {
    
                            printf(" %d %d", i4, i5);
    
                    }
    
                    printf("\n");
    
            }//end if
    
    } while (iSelect != 4);

} //end of main function
