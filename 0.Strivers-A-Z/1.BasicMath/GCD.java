import java.util.Scanner;

class GCD
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1 and n2");
        int n1=s.nextInt();
        int n2=s.nextInt();

        while(n1>0 && n2>0)
        {
            if(n1>n2) 
                n1%=n2;
            else   
                n2%=n1; 
        }

        System.out.println(n1==0?n2:n1);
    }
}