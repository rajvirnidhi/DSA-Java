import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList myLinkedList = new LinkedList();
        System.out.println("Welcome to linkedLists");
        int option;
        do{
            System.out.println("Select the operation");
            System.out.println("1. Display");
            System.out.println("2. Append");
            System.out.println("3. Remove Last");
            System.out.println("4. Prepend");
            System.out.println("5. Remove First");
            System.out.println("0. Exit");
            option=s.nextInt();
            if(option==0)
                break;
            if(option==1)
            {
                System.out.println("Displaying list");
                myLinkedList.display();
            }
            else if(option==2)
            {
                System.out.println("Enter value to append");
                int val=s.nextInt();
                myLinkedList.append(val);
            }
            else if(option==3)
            {
                try
                {
                    System.out.println(myLinkedList.removeLast().value);
                }
                catch(NullPointerException e)
                {
                    System.out.println("Linked list is empty");
                }
            }
            else if(option==4)
            {
                System.out.println("Enter value to prepend");
                int val=s.nextInt();
                myLinkedList.prepend(val);
            }
            else if(option==5)
            {
                try
                {
                    System.out.println(myLinkedList.removeFirst().value);
                }
                catch(NullPointerException e)
                {
                    System.out.println("Linked list is empty");
                }
            }
        }while(option!=0);

    }
}