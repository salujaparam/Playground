#include<stdio.h>
int main()
{
  //Type your code here
  float a, b, c;
  scanf("%f %f %f", &a, &b, &c);
  int sum = a+b+c;
  float avg = sum/3;
  printf("%.0f", avg);
  return 0;
}