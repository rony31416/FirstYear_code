#include<stdio.h>
void merge(int A[],int p,int q,int r)
{
    int n = q - p + 1;
    int m = r - q;
    int L[n],R[m];
    for(int i = 0 ; i < n ; i++)
    {
        L[i] = A[p+i];
    }
    for(int j = 0 ; j < m ; j++)
    {
        R[j] = A[q+1+j];
    }
    int i = 0 , j = 0 , k  = p;
    while(i < n && j < m )
    {
        if(L[i] <= R[j])
        {
            A[k] = L[i];
            i++;
        }
        else{
            A[k] = R[j];
            j++;
        }
        k++;
    }
    while(i < n)
    {
        A[k] = L[i];
        i++;
        k++;
    }
    while(j < n)
    {
        A[k] = R[j];
        j++;
        k++;
    }


}


 void merge_sort(int A[] , int left ,int right)
 {

     if(left < right)
     {
         int mid = (left+right)/2;
         merge_sort(A,left,mid);
         merge_sort(A,mid+1,right);
         merge(A,left,mid,right);

     }


 }


int main()
{

    int a[] = {6,5,12,-9,76,4324,90,42,-98,10,9,1};
	int size = sizeof(a)/sizeof(a[0]);
    merge_sort(a,0,size-1);
    for(int i = 0 ; i< 10 ; i++)
        printf("%d ",a[i]);

}
