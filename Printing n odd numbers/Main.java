#include <stdio.h>
int main() {
	//Type your code
  int i=1,count=0;
  int n;
  scanf("%d", &n);
  while(count<n){
    if(i%2==1){
      printf("%d\n", i);
      count++;
      i++;
    }
    else
      i++;
  }
	return 0;
}