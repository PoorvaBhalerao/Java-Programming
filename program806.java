// Write a program to display Fibbonacchi series
//  0   1   1   2   3   5   8   13  21  ...........
//using Dynamic Programming****

import java.util.*;

class program806
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, i = 0;

        System.out.println("Enter how many numbers you want to display from Fibbonacchi Series: ");
        iValue = sobj.nextInt();

        long dp[] = new long[iValue];

        dp[0] = 0;
        dp[1] = 1;

        for(i = 2; i<iValue ; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }

        for(i = 0; i<iValue ; i++)
        {
            System.out.print(dp[i]+"    ");

        }

        System.out.println();
        sobj.close();
    }
}