#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d", &a);
  int first = a / 100;
  int last = a % 10;
  int sum = first + last;
  printf("%d", sum);
  return 0;
}