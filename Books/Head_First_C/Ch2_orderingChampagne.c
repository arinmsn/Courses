#include <stdio.h>
#include <stdlib.h>

int main()
{
    int stock = 180;
    int order;
    while (stock > 0)
    {
        printf("%i glasses left\n", stock);
        scanf("%i", &order);
        printf("You ordered %i glasses\n", order);
    }
    puts("We're out of stock!");
    return 0;
}