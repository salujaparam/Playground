#include <stdio.h>
int main() {
	//Type your code
  int n;
  int sum=0;
  scanf("%d", &n);
  while(n!=0){
    int a = n % 10;
    sum = sum + a;
  	n = n/10;
  }
  printf("%d", sum);
	return 0;
}