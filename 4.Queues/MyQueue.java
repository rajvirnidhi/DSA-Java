public class MyQueue
{
    Node first;
    Node last;
    int length;

    public MyQueue()
    {
        length=0;
    }
    public MyQueue(int value)
    {
        Node newNode = new Node(value);
        first = last = newNode;
        length=1;
    }

    public void display()
    {
        Node temp = first;
        while(temp!=null)
        {
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println("");
    }

    public void enqueue(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            first=last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    public Node dequeue()
    {
        if(length==0)
            return null;
        Node temp = first;
        if(length==1)
        {
            first=last=null;
        }
        else
        {
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
}