import java.util.ArrayList;
import java.util.Scanner;
class PrintDivisors
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                arr.add(i);
                if(n/i!=i)
                {
                    arr.add(n/i);
                }
            }
        }

        arr.sort(null);
        System.out.println(arr);
    }
}