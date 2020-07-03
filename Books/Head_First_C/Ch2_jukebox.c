#include <stdio.h>
#include <stdlib.h>

char tracks[][80] = {
    "Zig Zag Wanderer",
    "You have made me so very happy",
    "From here to maternity",
    "Dancing with a Dork",
    "Someday Soon",
};

void find_track(char search_for[])
{
    int i;
    for (i = 0; i < 5; i++)
    {
        if (strstr(tracks[i], search_for))
        {
            printf("Track %i: '%s'\n", i, tracks[i]);
        }
    }
}

int main()
{
    char search_for[80];
    printf("Search for: ");
    scanf("%79s", search_for);
    find_track(search_for);
    return 0;
}