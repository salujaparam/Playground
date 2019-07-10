// CPP program to find N-th term 
// in the series 
#include <iostream> 
#include <math.h> 
using namespace std; 
  
// Function to find N-th term 
// in the series 
void findNthTerm(int n) 
{    
    // If n is even 
    if (n % 2 == 0) { 
        n = n / 2; 
        n = 2 * (n - 1); 
        cout << n / 2 << endl; 
    } 
    // If n is odd 
    else { 
        n = (n / 2) + 1; 
        n = 2 * (n - 1); 
        cout << n << endl; 
    } 
} 
  
// Driver code 
int main() 
{ 
  int n;
  cin>>n;
  findNthTerm(n);
} 