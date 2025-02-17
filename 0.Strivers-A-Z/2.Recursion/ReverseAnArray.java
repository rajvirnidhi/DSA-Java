import java.util.Scanner;

class ReverseAnArray
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=s.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        Reverse(arr,0);
        System.out.println("Reversed array");
        for(int num:arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void Reverse(int[] arr, int i)
    {
        if(arr.length/2<=i)
            return;
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        Reverse(arr, i+1);
    }
}