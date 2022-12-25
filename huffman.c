#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct Node
{
    char ch;
    int freq;
    struct Node* left;
    struct Node* right;
} Node;

Node *heap[100];
int heapSize = 0;


void Insert(Node *element)
{
    heapSize++;
    heap[heapSize] = element;
    int now = heapSize;
    while(heap[now/2]->freq > element->freq)
    {
        heap[now] = heap[now/2];
        now = now/2;
    }
    heap[now] = element;
}


Node *DeleteMin()
{
    Node *minElement,*lastElement;
    int child,now;
    minElement = heap[1];
    lastElement = heap[heapSize--];
    for(now = 1; now*2 <= heapSize ; now = child)
    {
        child = now*2;
        if(child != heapSize && heap[child+1]->freq < heap[child]->freq)
        {
            child++;
        }

        if(lastElement->freq > heap[child]->freq)
        {
            heap[now] = heap[child];
        }
        else
        {
            break;
        }
    }
    heap[now] = lastElement;

    return minElement;

}


void print(Node *temp,char *code)
{

    if(temp->left == NULL && temp->right == NULL)
    {
        printf("char %c code %s\n",temp->ch,code);
        return;
    }

    int length = strlen(code);
    char leftcode[10],rightcode[10];
    strcpy(leftcode,code);
    strcpy(rightcode,code);
    leftcode[length] = '0';
    leftcode[length+1] = '\0';
    rightcode[length] = '1';
    rightcode[length+1] = '\0';
    print(temp->left,leftcode);
    print(temp->right,rightcode);

}

int main()
{
    freopen("input.txt","r",stdin);


    int n;
    //printf("Enter the number of character: ");
    scanf("%d",&n);
    //printf("Enter the character and their frequencies: \n");
    char ch[100];
    int freq[100],i;
    for( i = 1 ; i<= n ; i++)
    {
        scanf(" %c",&ch[i]);

    }
    for( i = 2 ; i<= n ; i++)
    {
        scanf("%d",&freq[i]);
    }

    heap[0] = (Node *)malloc(sizeof(Node));
    heap[0]->freq = 0 ;
    for(i = 1; i<= n ; i++)
    {

        Node* temp = (Node*)malloc(sizeof(Node));
        temp->ch = ch[i];
        temp->freq = freq[i];
        temp->left = temp->right = NULL;

        Insert(temp);
    }
    if(n==1)
    {
        printf("char %c code 0\n",ch);
    }

    for(i = 0 ; i < n - 1 ; i++ )
    {
        Node* left = DeleteMin();
        Node* right = DeleteMin();

        Node* temp = (Node *)malloc(sizeof(Node));
        temp->ch = 0;
        temp->left = left;
        temp->right = right;
        temp->freq = left->freq+right->freq;

        Insert(temp);
    }
    Node *root = DeleteMin();
    char code[10];
    code[0] = '\0';
    print(root,code);


    return 0;
}
