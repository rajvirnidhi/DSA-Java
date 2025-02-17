import java.util.Scanner;
class PrintNto1
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
        System.out.println(n);
        Print(n-1);
    }
}