// Write a program to display Fibbonacchi series
//  0   1   1   2   3   5   8   13  21  ...........
//using Recursion

import java.util.*;

class program804
{
    public static long Fibonacchi(int N)

    {
        if(N <= 1)
        {
            return N;
        }

        return Fibonacchi(N-1) + Fibonacchi(N-2);
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, i = 0;

        System.out.println("Enter how many numbers you want to display from Fibbonacchi Series: ");
        iValue = sobj.nextInt();

        for(i = 0; i <= iValue ; i++)
        {
            System.out.print(Fibonacchi(i) + " ");
        }

        System.out.println();

        sobj.close();
    }
}