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
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }while(option!=0);
    }
}