import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");
        String str =s.nextLine();

        Compare(str,0);
    }

    public static void Compare(String str, int i)
    {
        if(str.length()/2<=i)
        {
            System.out.println("Palindrome string");
            return;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        {
            System.out.println("Not a palindrome string");
            return;
        }
        Compare(str, i+1);
    }
}