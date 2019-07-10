#include<stdio.h>

int main()
{
  // Type your code here
  int a, b, c, d;
  scanf("%d %d %d %d", &a, &b, &c, &d);
  int s;
  if(a<b && a<c && a<d)
    s = a;
  else if(b<a && b<c && b<d)
    s = b;
  else if(c<a && c<b && c<d)
    s = c;
  else
    s = d;
  printf("%d", s);
}