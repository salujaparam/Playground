#include<stdio.h>
int main()
{
  //Type your code here
  int t1 = 0, t2 =1;
  int n, sum=0;
  scanf("%d", &n);
  printf("%d %d", t1, t2);
  for(int i=2; i<n;i++){
    sum = t1 + t2;
    t1 = t2;
    t2 = sum;
    printf("% d", sum);
  }
  return 0;
}