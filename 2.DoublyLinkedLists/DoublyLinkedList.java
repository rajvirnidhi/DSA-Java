public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    public DoublyLinkedList()
    {
        length=0;
    }
    public DoublyLinkedList(int value)
    {
        Node newNode = new Node(value);
        head=tail=newNode;
        length=1;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value + " ");
            temp=temp.next;
        }
        System.out.println("");
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
            newNode.prev=tail;
            tail=tail.next;
        }
        length++;
    }

    public Node removeLast()
    {
        if(length==0)
            return null;
        Node temp=tail;
        if(length==1)
        {
            head=tail=null;
        }
        else
        {
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
    }

    public void prepend(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head=tail=newNode;
        }
        else
        {
            head.prev=newNode;
            newNode.next=head;
            head=head.prev;
        }
        length++;
    }

    public Node removeFirst()
    {
        if(length==0)
            return null;
        Node temp = head;
        if(length==1)
        {
            head=tail=null;
        }
        else
        {
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public Node get(int index)
    {
        if(index<0 || index>=length)
        {
            return null;
        }
        Node temp=head;
        if(index<length/2)
        {
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
        }
        else
        {
            temp=tail;
            for(int i=length-1;i>index;i--)
            {
                temp=temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value)
    {
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }
    
    public boolean insert(int index, int value)
    {
        if(index<0 || index>=length)
            return false;
        if(index==0)
        {
            append(value);
            return true;
        }
        if(index==length)
        {
            prepend(value);
            return true;
        }
        Node before=get(index-1);
        Node newNode = new Node(value);
        newNode.prev=before;
        newNode.next=before.next;
        before.next.prev=newNode;
        before.next=newNode;
        length++;
        return true;
    }

    public Node remove(int index)
    {
        if(index<0 || index>=length)
            return null;
        if(index==0)
            return removeFirst();
        if(index==length-1)
            return removeLast();
        
        Node temp = get(index);
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;

        temp.next=temp.prev=null;
        length--;
        return temp;
    }
}