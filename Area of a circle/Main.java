#include<stdio.h>
int main()
{
  //Type your code here
  int d;
  scanf("%d", &d);
  float r = (float)d/2;
  float area = r * r * 3.14;
  printf("%.2f", area);
  return 0;
}