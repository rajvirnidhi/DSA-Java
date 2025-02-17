import java.util.Scanner;
class Print1toN
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();

        Print(n);
    }


    public static void Print(int n)
    {
        if(n==0)
            return;
        Print(n-1);
        System.out.println(n);
    }
}