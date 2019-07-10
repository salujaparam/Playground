#include <stdio.h>

int main()
{
  float r, a;
  scanf("%f %f", &r, &a);
  float arc = (a*2*3.14*r)/360;
  printf("%.2f", arc);

    return 0;
}
