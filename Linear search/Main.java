#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d", &a[i]);
  int s, pos, c=0;
  scanf("%d", &s);
  for(int i=0;i<n;i++){
    if(s==a[i]){
      pos = i;
      c++;
      break;
    }
    else
      continue;
  }
  if(c!=0)
    printf("%d", pos+1);
  else
    printf("%d isn't present in the array.", s);
  return 0;
}