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

/*****************************************************
FUNCTION DEFINITION
*****************************************************/

int sportsQuestion(void) {

        int iAnswer = 0;

        system("clear");
        printf("\tSports Question\n");
        printf("\nWhat University did NFL star Deon Sanders attend? ");
        printf("\n\n1\tUniversity of Miami\n");
        printf("2\tCalifornia State University\n");
        printf("3\tIndiana University\n");
        printf("4\tFlorida State University\n");
        printf("\nEnter your selection: ");
        scanf("%d", &iAnswer);

        return iAnswer;

}

/*****************************************************
FUNCTION DEFINITION
*****************************************************/

int geographyQuestion(void) {

        int iAnswer = 0;

        system("clear");
        printf("\tGeography Question\n");
        printf("\nWhat is the state capitol of Florida? ");
        printf("\n\n1\tPenescola\n");
        printf("2\tTallahassee\n");
        printf("3\tJacksonville\n");
        printf("4\tMiami\n");
        printf("\nEnter your selection: ");
        scanf("%d", &iAnswer);

        return iAnswer;

} 

/*****************************************************
FUNCTION DEFINITION
*****************************************************/

int moviesQuestion(void) {

        int iAnswer = 0;

        system("clear");
        printf("\tMovies Question\n");
        printf("\nIn the Marvel cinematic universe, what is the name of Thor's home planet? ");
        printf("\n\n1\tMorag\n");
        printf("2\tSakaar\n");
        printf("3\tAsgard\n");
        printf("4\tAakon\n");
        printf("\nEnter your selection: ");
        scanf("%d", &iAnswer);

        return iAnswer;

}

/*****************************************************
FUNCTION DEFINITION
*****************************************************/

int mathQuestion(void) {

        int iAnswer = 0;

        system("clear");
        printf("\tMath Question\n");
        printf("\ne^(i*pi) equals what number? ");
        printf("\n\n1\t\n");
        printf("2\t0\n");
        printf("3\te+1\n");
        printf("4\t-1\n");
        printf("\nEnter your selection: ");
        scanf("%d", &iAnswer);

        return iAnswer;

}

/*****************************************************
FUNCTION DEFINITION
*****************************************************/

void pause(int inNum) {

        int iCurrentTime = 0;
        int iElapsedTime = 0;

        iCurrentTime = time(NULL);

        do {

                iElapsedTime = time(NULL);

        } while ((iElapsedTime - iCurrentTime) < inNum);

} 
