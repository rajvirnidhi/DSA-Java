import java.util.Scanner;

class ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        int sumofcube=0;
        int tempN=n;
        while(n!=0)
        {
            sumofcube+=Math.pow(n%10, 3);
            n/=10;
        }
        System.out.println( sumofcube==tempN ? "Number is armstrong":"Number is not armstrong");
    }
}