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
    int Search(int value)
    {
        Node newNode=head;
        int counter=0;
        while(newNode!=null)
        {
            if(newNode.data==value)
            {
                return counter;
            }
            counter++;
            newNode=newNode.next;
        }
        return -1;
    }
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        list.printList();
        int a=list.Search(7);
        if(a==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index "+a);
    }
}
