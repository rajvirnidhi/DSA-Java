import java.util.Scanner;
class CheckPrime
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        boolean flag = true;
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}