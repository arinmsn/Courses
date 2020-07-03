#include <stdio.h>

void print_reverse(char *s)
{
    size_t len = strlen(s);
    char *t = s + len - 1;
    while (t >= s)
    {
        printf("%c", *t);
        t = t - 1;
    }
    puts("");
}

int main()
{
    print_reverse("DEAD");                // DEAD
    print_reverse(".eb ot ton ro eb oT"); // To be or not to be.
}