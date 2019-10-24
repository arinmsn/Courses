#include <stdio.h>

main()

{
  char cNameChar1 = '\0';
  char cNameChar2 = '\0';
  char cNameChar3 = '\0';
  char cNameChar4 = '\0';

  printf("\nEnter your name: ");
  scanf("%c%c%c%c", &cNameChar1, &cNameChar2, &cNameChar3, &cNameChar4);
  printf("Oh, how rude of me. Hi, %c%c%c%c!", cNameChar1, cNameChar2, cNameChar3, cNameChar4);
  return 0;
}
