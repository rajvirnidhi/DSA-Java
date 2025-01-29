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
            System.out.print(temp.value+" ");
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
            tail=newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        if(length==0)
            return null;
        if(length==1)
        {
            head=tail=null;
            length--;
            return head;
        }
        Node temp=head;
        Node pre=head;
        while(temp.next!=null)
        {
            pre=temp;
            temp=temp.next;
        }

        pre.next=null;
        length--;
        tail=pre;
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
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst()
    {
        if(length==0)
            return null;
        
        Node temp = head;
        head=head.next;
        length--;
        if(length==0)
            tail=null;
        temp.next=null;
        return temp;
    }

    public Node get(int index)
    {
        if(index<0 && index>length)
            return null;
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public boolean set(int index, int val)
    {
        if(index<0 && index>length)
            return false;
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value = val;
            return true;
        }
        return false;
    }

    public void Reverse()
    {
        Node before = null;
        Node after = head;
        Node temp = head;

        head=tail;
        tail=temp;

        while(after!=null)
        {
            temp=after;
            after=temp.next;
            temp.next=before;
            before=temp;
        }
        head=temp;
    }
}