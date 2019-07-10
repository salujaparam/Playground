#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  while(n>=100)
    n = n/10;
  int a = n%10;
  printf("%d", a);
	return 0;
}