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
    void delete()
    {
        Node currNode=head;
        Node prevNode=new Node(2);
        prevNode.next=currNode;
        while(currNode!=null)
        {
            if(currNode.data<=25)
            break;
            else
            {
                head=currNode.next;
                currNode=head;
                prevNode.next=currNode;
            }
        }
        while(currNode!=null)
        {
            if(currNode.data>25)
            {
                prevNode.next=currNode.next;
                currNode=currNode.next;
            }
            else
            {
                prevNode=prevNode.next;
                currNode=currNode.next;
            }
        }
    }
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.addFirst(31);
        list.addFirst(20);
        list.addFirst(80);
        list.addFirst(31);
        list.addFirst(77);
        list.addFirst(50);
        list.addFirst(10);
        list.addFirst(38);
        list.addFirst(20);
        list.addFirst(88);
        list.addFirst(39);
        list.addFirst(78);
        list.addFirst(50);
        list.addFirst(1);
        list.addFirst(13);
        list.addFirst(22);
        list.addFirst(81);
        list.addFirst(33);
        list.addFirst(77);
        list.addFirst(55);
        list.addFirst(144);
        list.addFirst(30);
        list.addFirst(29);
        list.addFirst(89);
        list.addFirst(34);
        list.addFirst(20);
        list.addFirst(55);
        list.addFirst(20);
        list.addFirst(21);
        list.addFirst(65);
        list.addFirst(87);
        list.addFirst(25);
        list.addFirst(27);
        list.addFirst(15);
        list.addFirst(10);
        list.addFirst(59);
        list.addFirst(16);
        list.addFirst(8);
        list.addFirst(23);
        list.addFirst(77);
        list.addFirst(15);
        list.addFirst(16);
        list.addFirst(11);
        list.addFirst(22);
        list.addFirst(81);
        list.addFirst(30);
        list.addFirst(70);
        list.addFirst(54);
        list.addFirst(12);
        list.addFirst(90);
        list.addFirst(165);
        list.addFirst(88);
        list.addFirst(43);
        list.addFirst(12);
        list.addFirst(5);
        list.addFirst(9);
        list.addFirst(67);
        list.addFirst(2);
        list.addFirst(11);
        list.addFirst(18);
        list.addFirst(39);
        list.addFirst(45);
        list.addFirst(21);
        list.addFirst(98);
        list.addFirst(92);
        list.addFirst(18);
        list.addFirst(13);
        list.addFirst(47);
        list.addFirst(5);
        list.addFirst(17);
        list.addFirst(83);
        list.addFirst(92);
        list.addFirst(18);
        list.addFirst(23);
        list.addFirst(37);
        list.addFirst(45);
        list.addFirst(19);
        list.addFirst(3);
        list.addFirst(20);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(71);
        list.addFirst(51);
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(32);
        list.addFirst(73);
        list.addFirst(5);
        list.addFirst(16);
        list.addFirst(36);
        list.addFirst(21);
        list.addFirst(84);
        list.addFirst(3);
        list.addFirst(97);
        list.addFirst(52);
        list.addFirst(14);
        list.addFirst(39);
        list.addFirst(27);
        list.printList();
        System.out.println("After deleting necessary elements");
        list.delete();
        list.printList();
    }
}
