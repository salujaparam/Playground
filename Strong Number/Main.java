#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int n1 = n;
  int sum = 0;
  while(n != 0){
    int last = n%10;
    int fact = 1;
    for(int i=1;i<=last;i++){
      fact = fact*i;
    }
    sum = sum + fact;
    n = n/10;
  }
  if(sum == n1)
    printf("Yes");
  else
    printf("No");
	return 0;
}