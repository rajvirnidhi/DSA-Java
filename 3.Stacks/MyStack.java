public class MyStack
{
    Node top;
    int height;

    public MyStack()
    {
        height=0;
    }

    public MyStack(int value)
    {
        top = new Node(value);
        height=1;
    }

    public void display()
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void push(int value)
    {
        Node newNode = new Node(value);
        if(height==0)
            top = newNode;
        else
        {
            newNode.next=top;
            top = newNode;
        }
        height++;
    }
}