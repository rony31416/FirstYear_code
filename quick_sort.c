#include<stdio.h>
void swap(int *a,int *b)
{

    int t = *a;
    *a = *b;
    *b = t;
}

int partition(int A[],int l,int r)
{
    int pivot = A[r];
    int i = l;
    for(int j = l; j< r ; j++)
    {
        if(A[j] <= pivot)
        swap(&A[i],&A[j]),i++;
    }
    swap(&A[i],&A[r]);

    return (i);

}


void quicksort(int A[],int left,int right)
{
    if(left < right)
    {
        int p = partition(A,left,right);
        quicksort(A,left,p-1);
        quicksort(A,p+1,right);
    }
}

int main()
{

	int a[] = {6,5,12,-9,76,4324,90,42,-98,10,9,1};
	int size = sizeof(a)/sizeof(a[0]);

	quicksort(a,0,size-1);
	for(int i = 0 ; i< size ; i++) printf("%d ",a[i]);

 return 0;
 }

