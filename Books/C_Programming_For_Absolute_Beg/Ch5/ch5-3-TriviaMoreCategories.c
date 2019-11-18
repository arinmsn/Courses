#include <stdio.h>

/*****************************************************
FUNCTION PROTOTYPES
*****************************************************/

int sportsQuestion(void);
int geographyQuestion(void);
int astronomyQuestion(void);
int mathQuestion(void);
void pause(int);

/****************************************************/

/*****************************************************
GLOBAL VARIABLE
*****************************************************/
int giResponse = 0;
/****************************************************/

main() {

        do {

                system("clear");
                printf("\n\tTHE TRIVIA GAME\n\n");
                printf("1\tSports\n");
                printf("2\tGeography\n");
                printf("3\tMovies\n");
                printf("4\tMath\n");
                printf("5\tQuit\n");
                printf("\n\nEnter your selection: ");
                scanf("%d", &giResponse);
                
                switch(giResponse) {
                    case 1:
                        if (sportsQuestion() == 4)
                            printf("\nCorrect!\n");
                        else
                            printf("\nIncorrect\n");
                            pause(2);
                            break;
                    case 2:
                        if (geographyQuestion() == 2)
                            printf("\nCorrect!\n");
                        else 
                            printf("\nIncorrect!\n");
                            pause(2);
                            break;
                    case 3:
                        if (moviesQuestionQuestion() == 3)
                            printf("\nCorrect!\n");
                        else 
                            printf("\nIncorrect!\n");
                            pause(2);
                            break;
                    case 4:
                        if (mathQuestion() == 4)
                            printf("\nCorrect!\n");
                        else 
                            printf("\nIncorrect!\n");
                            pause(2);
                            break;
                } //end of switch
        } while (giResponse != 5);
} // end of main()
