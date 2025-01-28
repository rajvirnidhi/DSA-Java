public class LinkedList
{
    Node head;
    Node tail;
    int length;

    public LinkedList()
    {
        length=0;
    }

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head=tail=newNode;
        length=1;
    }

    public void display()
    {
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    
}