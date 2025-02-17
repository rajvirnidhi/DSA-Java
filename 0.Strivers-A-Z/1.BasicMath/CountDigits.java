import java.util.Scanner;

class CountDigits
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        int tempN=n;
        int count=0;
        while(tempN!=0)
        {
            tempN/=10;
            count++;
        }
        System.out.println("Number of digits are "+count);
    }
}