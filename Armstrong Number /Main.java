#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int n1 = n;
  int sum = 0;
  int last;
  int count = 0;
    while(n != 0){
      n = n/10;
      count++;
  }
  n=n1;
  while(n != 0){
    last = n%10;
    last = pow(last, count);
    sum = sum + last;
    n = n/10;
  }
  if(n1 == sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}