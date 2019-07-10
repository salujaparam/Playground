#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int i=0;
  while(i<=n){
    if(i%2 == 1){
      printf("%d\n", i);
    }
    i++;
  }
	return 0;
}