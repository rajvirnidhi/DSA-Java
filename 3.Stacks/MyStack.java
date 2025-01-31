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

    public Node pop()
    {
        if(height==0)
            return null;
        Node temp = top;
        if(height==1)
        {
            top=null;
        }
        else
        {
            top=temp.next;
            temp.next=null;
        }
        height--;
        return temp;
    }

    public Node peek()
    {
        if(height==0)
            return null;
        return top;
    }
}