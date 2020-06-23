#include <stdio.h>
#include <stdlib.h>

int main()
{
    int stock = 180;
    // We are able to enter up to 2 digits.
    char order_string[4];
    int order;
    while (stock > 0)
    {
        printf("%i glasses left\n", stock);
        scanf("%3s", order_string);
        // Converting string into a number
        order = atoi(order_string);
        stock = stock - order;
        printf("You ordered %i glasses\n", order);
    }
    puts("We're out of stock!");
    return 0;
}