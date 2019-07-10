#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int last = n%10;
  while(n>=10)
    n = n/10;
  int first = n%10;
  int sum = first + last;
  printf("%d", sum);
	return 0;
}