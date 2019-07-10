#include<stdio.h>
#include<math.h>

void binToDec(int n){
  int count = 0;
  int n1 = n;
  while(n!=0){
    n = n/10;
    count++;
  }
  int arr[count];
  
  for(int i=0;i<count;i++){
    arr[i] = n1%10;
    n1 = n1/10;
  }
  int sum=0, sum1 = 0;
  for(int i=0;i<count;i++){
    sum = arr[i] * pow(2, i);
    sum1 = sum+ sum1;
  }
  printf("%d", sum1);
}
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  binToDec(n);
  return 0;
}