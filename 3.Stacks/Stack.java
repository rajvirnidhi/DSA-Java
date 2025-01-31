public class Stack
{
    Node top;
    int height;

    public Stack()
    {
        height=0;
    }

    public Stack(int value)
    {
        top = new Node(value);
        height=1;
    }

}