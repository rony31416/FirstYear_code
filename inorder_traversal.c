#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *left, *right;
};

struct node* create(){
    int x;
    struct node *newNode;
    newNode=(struct node*)malloc(sizeof(struct node));
    printf("Enter data (-1 for no node): ");
    scanf("%d",&x);
    if(x==-1){
        return 0;
    }
    newNode->data=x;
    printf("Enter left child of %d ",x);
    newNode->left=create();
    printf("Enter right child of %d: ",x);
    newNode->right=create();
    return newNode;
}


void inorder(struct node *root){
    if(root==0){
        return;
    }
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}


int main()
{
    struct node *root;
    root=0;
    root=create();
    printf("\n\nIneorder : ");
    inorder(root);

}
