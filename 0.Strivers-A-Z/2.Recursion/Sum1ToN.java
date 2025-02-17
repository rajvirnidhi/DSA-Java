import java.util.Scanner;
class Sum1toN
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();

        System.out.println(Sum(n));
    }


    public static int Sum(int n)
    {
        if(n==1)
            return 1;
        return n+Sum(n-1);
    }
}