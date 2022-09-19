#include<stdio.h>
#include<stdbool.h>

int bubbleSort(int *arr,int len){
    int count=0,flag=1,i=0;
    while(flag!=0){   
        flag=0;
        count++;
        int temp;
        for(int j=0;j<len-1-i;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
        }
        i++;
    }
    return count;
}

int main(){
    int n;
    scanf("%d",&n);
    int arr[5000];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("%d",bubbleSort(arr,n));
}
