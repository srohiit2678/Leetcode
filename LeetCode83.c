#include<stdio.h>
#include<stdlib.h>

void insertAtBigin(int);
void showAllV();
void insertAtEnd(int);
int countNode();
void insertAtPosition(int,int);
void deleteAtBigin();
void deleteAtEnd();
void deleteAtPosition(int);
struct Node{
int data;
struct Node *next;
};
struct Node *start = NULL;

void reverseShowAll(struct Node*);
struct Node* deleteDuplicates(struct Node*);
void main(){
    insertAtEnd(10);
    insertAtEnd(10);
    insertAtEnd(10);
    showAllV();
    deleteDuplicates(start);
    showAllV();
}

struct Node* deleteDuplicates(struct Node* head) {
    if(head==NULL)return head;
    struct Node* temp1 = head->next;
    struct Node* temp2 = head;
    struct Node* temp3;
    while(temp1!=NULL){
        if(temp1->data == temp2->data){
            temp1 = temp1->next;
            free(temp2->next);
            temp3 = temp2;
            temp2->next = temp1;
        }
        if(temp1==NULL){
            break;
        }
        temp1=temp1->next;
        temp2=temp2->next;
        if(temp2->data==temp3->data){
            temp2 = temp2->next;
            free(temp3->next);
            temp3->next = temp2;
           // temp1 = temp1->next;
        }

    }
    return head;
}

void insertAtBigin(int x){
struct Node *temp = malloc(sizeof(struct Node));
if (temp == NULL)
{
    printf(" No space...\n");
    return;
}
temp -> data = x;
temp ->next = start;
start = temp;
}

void showAllV(){
    if(start==NULL)printf("Empty List...\n");

    struct Node *temp = start;
    while(temp!= NULL){
        printf("%d->",temp->data);
        temp = temp->next;
    } 
    printf("X\n\n");
}


void insertAtEnd(int x){
if(start==NULL){
    insertAtBigin(x);
    return;
}
struct Node *temp1 = start;
while(temp1->next!=NULL){
    temp1 = temp1->next;
    
}
struct Node *temp = malloc(sizeof(struct Node));
temp->data = x;
temp ->next = NULL;
temp1->next = temp; 
}

int countNode(){
 int c =0;
 struct Node *temp = start;
    while(temp!= NULL){
        c++;
        temp = temp->next;
    }   
    return c;
}

void insertAtPosition(int p,int x){

    if(p<=1){
        insertAtBigin(x);
        return;
    }
    if(p>countNode()){
         insertAtEnd(x);
         return;
    }
    struct Node *temp1 = start;
    for(int i=1;i<p-1;i++){
        temp1 = temp1->next;
    }

    struct Node *temp = malloc(sizeof(struct Node));
      
    temp -> data = x;
    temp -> next = temp1 ->next;
    temp1 ->next = temp;
}

void deleteAtBigin(){
    if(start==NULL){
        printf("Empty List....\n");
        return;
    }
    
    struct Node *temp1 = start;
    start = start -> next;
    free(temp1);   
}


void deleteAtEnd(){
    struct Node *temp1 = start;
    struct Node *temp2 = start;
    while(temp1->next!=NULL){
        temp2 = temp1;
        temp1 = temp1-> next;
    }
    temp2->next = NULL;
    free(temp1);
}

void deleteAtPosition(int p){
    if(p<=1){
        deleteAtBigin();
        return;
    }
    if(p>countNode()){
        deleteAtEnd();
        return;
    }

    struct Node *temp1 = start;
    struct Node *temp2 = start;


    for(int i = 1;i<p;i++){
        temp2 = temp1;
        temp1 = temp1->next;
    }
    temp2->next = temp1->next;
    free(temp1);
}

void reverseShowAll(struct Node* temp){
    if(temp==NULL)return;
    reverseShowAll(temp->next);
    printf("%d ",temp->data);
}