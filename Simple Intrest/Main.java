#include<stdio.h>
int main()
{
  //your code here
  int t;
  float p,r;
  scanf("%f %d", &p, &t);
  scanf("%f", &r);
  float si = (p*r*t)/100;
  printf("%f", si);
  return 0;
}