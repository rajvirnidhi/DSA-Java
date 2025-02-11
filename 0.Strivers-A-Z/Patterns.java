class Patterns
{
    public static void main(String args[])
    {
        System.out.println("Pattern 1");
        Pattern1(5);

        System.out.println("Pattern 2");
        Pattern2(5);

        System.out.println("Pattern 3");
        Pattern3(5);

        System.out.println("Pattern 4");
        Pattern4(5);

        System.out.println("Pattern 5");
        Pattern5(5);

        System.out.println("Pattern 6");
        Pattern6(5);

        System.out.println("Pattern 7");
        Pattern7(5);

        System.out.println("Pattern 8");
        Pattern8(5);

        System.out.println("Pattern 9");
        Pattern9(5);

        System.out.println("Pattern 10");
        Pattern10(5);

        System.out.println("Pattern 11");
        Pattern11(5);

        System.out.println("Pattern 12");
        Pattern12(5);

        System.out.println("Pattern 13");
        Pattern13(5);

        System.out.println("Pattern 14");
        Pattern14(5);

        System.out.println("Pattern 15");
        Pattern15(5);

        System.out.println("Pattern 16");
        Pattern16(5);

        System.out.println("Pattern 17");
        Pattern17(5);

        System.out.println("Pattern 18");
        Pattern18(5);

        System.out.println("Pattern 19");
        Pattern19(5);

        System.out.println("Pattern 20");
        Pattern20(5);

        System.out.println("Pattern 21");
        Pattern21(5);

        System.out.println("Pattern 22");
        Pattern22(5);
    }

    /*
        Pattern 1
        *****
        *****
        *****
        *****
        *****
     */
    public static void Pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern 2
        *
        **
        ***
        ****
        *****
     */
    public static void Pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
        Pattern 3
        1
        12
        123
        1234
        12345
     */
    public static void Pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    /*
        Pattern 4
        1
        22
        333
        4444
        55555
     */
    public static void Pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    /*
        Pattern 5
        *****
        ****
        ***
        **
        *
     */
    public static void Pattern5(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern 6
        12345
        1234
        123
        12
        1
     */
    public static void Pattern6(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
        space   star    space   
        4        1       4
        3        3       3   
        2        5       2
        1        7       1
        0        9       0   

        Pattern 7
            *    
           ***   
          *****  
         ******* 
        *********
     */
    public static void Pattern7(int n)
    {
        int count=1;
        for(int i=0;i<n;i++)
        {
            //spaces
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<count;j++)
            {
                System.out.print("*");
            }
            count+=2;

            //spaces
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        space   star    space  
        0        9       0  
        1        7       1
        2        5       2
        3        3       3   
        4        1       4

        Pattern 8
        *********
         ******* 
          *****  
           ***   
            * 
     */
    public static void Pattern8(int n)
    {
        int count=2*n-1;
        for(int i=0;i<n;i++)
        {
            //spaces
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<count;j++)
            {
                System.out.print("*");
            }
            count-=2;

            //spaces
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        Pattern 7
            *    
           ***   
          *****  
         ******* 
        *********
        *********
         ******* 
          *****  
           ***   
            *
     */
    public static void Pattern9(int n)
    {
        Pattern7(n);
        Pattern8(n);
    }

    /*
        Pattern 10
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
     */
    public static void Pattern10(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int stars=i;
            if(i>n)
                stars=2*n-i;
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern 11
        1
        01
        101
        0101
        10101
     */
    public static void Pattern11(int n)
    {
        int start=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                start=1;
            else start=0;

            for(int j=0;j<=i;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    /*
        Pattern 12
        1        1
        12      21
        123    321
        1234  4321
        1234554321
    */
    public static void Pattern12(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=0;j<((2*n)-(2*i));j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
        Pattern 13
        1 
        2 3 
        4 5 6 
        7 8 9 10 
        11 12 13 14 15  
     */
    public static void Pattern13(int n)
    {
        int num=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    /*
        Pattern 14
        A
        AB
        ABC
        ABCD
        ABCDE
     */
    public static void Pattern14(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char ch ='A';ch<=(char)('A'+i);ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
        Pattern 15
        ABCDE
        ABCD
        ABC
        AB
        A
     */
    public static void Pattern15(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char ch ='A';ch<(char)('A'+n-i);ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
        Pattern 16
        A
        BB
        CCC
        DDDD
        EEEEE
     */
    public static void Pattern16(int n)
    {
        char ch = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
        
    }

    /*
        Pattern 17
            A    
           ABA   
          ABCBA  
         ABCDCBA 
        ABCDEDCBA
     */
    public static void Pattern17(int n)
    {
        int count=1;
        for(int i=0;i<n;i++)
        {
            char ch ='A';
            //spaces
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //char
            int breakpoint = (2*i-1)/2;
            for(int j=0;j<count;j++)
            {
                System.out.print(ch);
                if(j<=breakpoint)
                    ch++;
                else    
                    ch--;
            }
            count+=2;

            //spaces
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        Pattern 18
        E
        ED
        EDC
        EDCB
        EDCBA
     */
    public static void Pattern18(int n)
    {
        for(int i=0;i<n;i++)
        {
            char ch=(char)('A'+ n-1);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch--);
            }
            System.out.println();
        }
    }

    /*
        Pattern 19
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********

     */
    public static void Pattern19(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }

            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }

            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=0;j<((2*n)-(2*i)-2);j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern 20
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *
     */
    public static void Pattern20(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<((2*n)-(2*i));j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int count=2;
        for(int i=1;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }

            for(int j=0;j<count;j++)
            {
                System.out.print(" ");
            }
            count+=2;

            for(int j=n-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        Pattern 21
        *****
        *   *
        *   *
        *   *
        *****
     */
    public static void Pattern21(int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1) 
            {    
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int j=0;j<n-2;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /*
        Pattern 22
        555555555
        544444445
        543333345
        543222345
        543212345
        543222345
        543333345
        544444445
        555555555
     */
    public static void Pattern22(int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int top=i;
                int left=j;
                int right=(2*n - 2)-j;
                int bottom=(2*n - 2)-i;
                System.out.print(n-Math.min(top,Math.min(Math.min(left,right),bottom)));
            }
            System.out.println();
        }
    }
}