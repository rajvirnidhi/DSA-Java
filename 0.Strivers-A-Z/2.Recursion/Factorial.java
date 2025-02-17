import java.util.Scanner;
class Factorial
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();

        System.out.println(fact(n));
    }

    public static int fact(int n)
    {
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
}