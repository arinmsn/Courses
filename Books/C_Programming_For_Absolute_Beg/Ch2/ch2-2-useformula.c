#include <stdio.h>

main()

{
  /*Formula to print f = (a - b)(x - y) */
  int iA = 0, iB = 0, iX = 0, iY = 0;
  int iF = 0; 

  printf("\nf = (a - b)(x - y)\n");
  printf("Enter a value for variable a: ");
  scanf("%i", &iA);
  printf("Enter a value for variable b: ");
  scanf("%i", &iB);
  printf("Enter a value for variable x: ");
  scanf("%i", &iX);
  printf("Enter a value for variable y: ");
  scanf("%i", &iY);

  printf("\na = %i, b = %i\nx = %i, y = %i\n\nf = (a - b)(x - y) = %i\n", iA, iB, iX, iY, iF = (iA -iB)*(iX - iY));
  return 0;
}
