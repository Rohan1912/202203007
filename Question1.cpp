#include <iostream>
using namespace std;
class Node
{
    public : 
    int data;
    Node *next;
    Node(int data){
		this->data = data;
		this->next = NULL;
	}
	~Node(){
		int value = this->data;
		if(this->next != NULL){
			delete next;
			this->next = NULL;
		}
		cout<<"Memory is free"<<endl;
	}
};
void addFirst(Node * &head,int data)
{
    Node* curr = new Node(data);
    curr->next = head;
	head = curr;
}
void addLast(Node* &tail,int data)
{
    Node* temp = new Node(data);
	tail->next = temp;
	tail = tail->next;
}
void addIndex(Node* &head, Node* & tail,int index, int data)
{
	if(index==0){
		addFirst(head,data);
		return;
	}
	Node* curr=head;
	int c=0;
	while(c<index-1){
		curr=curr->next;
		c++;
	}
	if(curr->next==NULL){
		addLast(tail,data);
		return;
	}
	Node*  nodetoinsert = new Node(data);
	nodetoinsert->next = curr->next;
	curr->next = nodetoinsert;
}
void printList(Node* &head)
{
	Node* curr=head;
	cout<<"Linked list: ";
	while(curr!=NULL){
		cout<<curr->data<< "\t";
		curr=curr->next;
	}	
	cout<<endl;	
}
void deleteIndex(int index, Node* &head){
	if(index==0){
		Node* temp=head;
		head=head->next;
		temp->next=NULL;
		delete temp;
	}
	else{
		Node* curr=head;
		Node* prev=NULL;
		int c=0;
		while(c<index){
			prev=curr;
			curr=curr->next;
			c++;
		}
		prev->next=curr->next;
		curr->next=NULL; 
		delete curr; 
		
	}
}
int main()
{
    Node* node=new Node(25);
    cout<<"Linked list: "<<node->data<<endl;
    Node* head=node;
    Node* tail=node;
    addFirst(head,73);
    printList(head);
    addFirst(head,5);
    printList(head);
    addLast(tail,16);
    printList(head);
    addLast(tail,36);
    printList(head);
    addIndex(head,tail,2,67);
    printList(head);
    addIndex(head,tail,1,19);
    printList(head);
    deleteIndex(0,head);
    printList(head);
    deleteIndex(5,head);
    printList(head);
    deleteIndex(1,head);
    printList(head);
    deleteIndex(0,head);
    printList(head);
    return 0;
}
