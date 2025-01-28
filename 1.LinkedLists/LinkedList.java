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
}