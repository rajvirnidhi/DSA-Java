import java.util.Scanner;

class CheckPalindrome
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        int revN=0;
        int tempN=n;
        while(n!=0)
        {
            revN=revN*10+n%10;
            n/=10;
        }
        System.out.println( revN==tempN ? "Number is palindrome":"Number is not palindrome");
    }
}