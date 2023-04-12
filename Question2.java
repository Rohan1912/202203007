import java.util.*;
class LinkedList
{
    Node head;
    private int size;
    LinkedList()
    {
        this.size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.next=null;
            this.data=data;
            size++;
        }
    }
    void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    void addLast(int data)
    {
        Node newNode=new Node(data);
        Node curr=head;
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
            newNode.next=null;
         }
         size++;
    }
    void addIndex(int data,int index)
    {
        Node newNode=new Node(data);
        if(index==0)
        addFirst(data);
        else{
        if(head==null)
        {
            head=newNode;
        }
        else{
        Node currNode=head;
        Node nextNode=head.next;
        int counter=0;
        while(counter<index-1)
        {
            currNode=currNode.next;
            nextNode=nextNode.next;
            counter++;
        }
        currNode.next=newNode;
        newNode.next=nextNode;
        }
        }
    }
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node curr=head;
            head=curr.next;
        }
    }
    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node prev=head;
            if(prev.next==null)
            head=null;
            else{
            Node last=head.next;
            while(last.next!=null)
            {
                prev=prev.next;
                last=last.next;
            }
            prev.next=null;
        }
        }
    }
    void deleteIndex(int index)
    {
        if(index==0)
        deleteFirst();
        else{
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
        Node currNode=head;
        Node nextNode=head.next;
        int counter=0;
        while(counter<index-1)
        {
            currNode=currNode.next;
            nextNode=nextNode.next;
        }
        currNode.next=nextNode.next;
        nextNode=null;
        }
        }
    }
    void printList()
    {
        Node newNode=head;
        System.out.print("Linked List: ");
        while(newNode!=null)
        {
            System.out.print(newNode.data+"\t");
            newNode=newNode.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.addFirst(73);
        list.printList();
        list.addFirst(5);
        list.printList();
        list.addLast(16);
        list.printList();
        list.addLast(36);
        list.printList();
        list.addIndex(67,2);
        list.printList();
        list.addIndex(19,1);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteIndex(1);
        list.printList();
        list.deleteIndex(0);
        list.printList();
    }
}
