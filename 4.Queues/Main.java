import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();
        System.out.println("Enter the selection");
        int option;
        do
        {
            System.out.println("1. Display");
            System.out.println("2. Enqueue");
            System.out.println("3. Dequeue");
            System.out.println("0. Exit");
            option = s.nextInt();
            switch (option) {
                case 1:
                    myQueue.display();
                    break;
                case 2:
                    System.out.println("Enter the value to enqueue");
                    int value = s.nextInt();
                    myQueue.enqueue(value);
                    break;
                case 3:
                    try
                    {
                        System.out.println("Dequeued value "+ myQueue.dequeue().value);
                    }
                    catch (NullPointerException e) {
                        System.out.println("Sorry... No value to dequeue");
                    }
                    break;
            }
        }while(option!=0);
    }
}