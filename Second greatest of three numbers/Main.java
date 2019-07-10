#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c,second;
  scanf("%d %d %d", &a, &b, &c);
  if((a>b && a<c) || (a<b && a>c))
    printf("%d", a);
  if((b>a && b<c) || (b<a && b>c))
    printf("%d", b);
  else if((c>a && c<b) || (c<a && c>b))
    printf("%d", c);
}