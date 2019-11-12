#include <stdio.h>


/*********************************
 FUNCTION PROTOTYPES
*********************************/
int sportsQuestion(void);
int geographyQuestion(void);
void pause(int);
/********************************

/*********************************
 GLOBAL VARIABLE
*********************************/
int giResponse = 0;
/********************************/

main()
{
    do{
        system("clear");
        printf("\n\tTHE TRIVIA GAME\n\n");
        printf("1\tSports\n");
        printf("2\tGeography\n");
        printf("3\tQuit\n");
        printf("\n\nEnter your selection: ");
        scanf("%d", &giResponse);
        
        switch(giResponse){
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
                    printf("\nIncorrect\n");
                pause(2);
                break;
        }   // end swtich
    } while (giResponse != 3);
} //end main function 


/********************************
FUNCTION DEFINITION
********************************/
int sportsQuestion(void)
{
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
} //end sportsQuestion function

/********************************
FUNCTION DEFINITION
********************************/
int geographyQuestion(void)
{
    int iAnswer = 0;
    
    system("clear");
    printf("\tGeography Question\n");
    printf("\nWhat is the state capitaol of Florida? ");
    printf("\n\n1\tPensecola\n");
    printf("2\tTallahassee\n");
    printf("3\tJacksonville\n");
    printf("4\tMiami\n");
    printf("\nEnter your selection: ");
    scanf("%d", &iAnswer);
    
    return iAnswer;
} //end geographyQuestion function

/********************************
FUNCTION DEFINITION
********************************/
void pause(int inNum)
{
    int iCurrentTime = 0;
    int iElapsedTime = 0;
    iCurrentTime = time(NULL);
    
    do{
        iElapsedTime = time(NULL);
    } while ( (iElapsedTime - iCurrentTime) < inNum);
} //end pause function
