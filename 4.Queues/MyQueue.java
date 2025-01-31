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
}