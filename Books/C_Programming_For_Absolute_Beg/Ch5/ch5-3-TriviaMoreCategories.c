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
