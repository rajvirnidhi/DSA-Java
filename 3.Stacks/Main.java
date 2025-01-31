import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.println("Enter the selection");
        
        int option;
        do
        {
            System.out.println("1. Display");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Peek");
            System.out.println("0. Exit");
            option=s.nextInt();
            switch (option) {
                case 1:
                    myStack.display();
                    break;
                case 2:
                    System.out.println("Enter the value to push");
                    int value = s.nextInt();
                    myStack.push(value);
                    break;
                case 3:
                    break;
            }
        }while(option!=0);
    }
}