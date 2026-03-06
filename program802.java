// Write a program to display Fibbonacchi series
//  0   1   1   2   3   5   8   13  21  ...........
//using iteration

import java.util.*;

class program802
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, i = 0, iFirst = 0, iSecond = 0, iNext = 0;

        System.out.println("Enter how many numbers you want to display from Fibbonacchi Series: ");
        iValue = sobj.nextInt();

        for(i = 1, iFirst = 0, iSecond = 1; i <= iValue; i++)
        {
            System.out.print(iFirst+"\t");
            iNext = iFirst + iSecond;
            
            iFirst = iSecond;
            iSecond = iNext;
        }

        System.out.println();

        sobj.close();
    }
}