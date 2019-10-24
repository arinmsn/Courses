#include <stdio.h>

int main()
{
    float fRate = 0;
    float fSalesPrice = 0;
    float fCost = 0;
    float fCommission = 0;
    
    printf("Commisssion = rate * (sales price - cost)");
    printf("\nEnter the rate (e.g. 0.02 for 2 percent): ");
    scanf("%f", &fRate);
    printf("Enter the sales price: ");
    scanf("%f", &fSalesPrice);
    printf("Enter the cost: ");
    scanf("%f", &fCost);
    
    printf("\nCommission is %.2f", fCommission = fRate*(fSalesPrice - fCost));
    return 0;
}
