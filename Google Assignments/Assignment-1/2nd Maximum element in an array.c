#include <stdio.h>

int main(void) {
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  int sm=0,fm=0;
  for(int i=0;i<n;i++){
    if(arr[i]>fm){
      sm=fm;
      fm=arr[i];;
    }
    else if(arr[i]>sm && arr[i]<fm){
      sm=arr[i];
    }
  }
  printf("%d",sm);
  return 0;
}
