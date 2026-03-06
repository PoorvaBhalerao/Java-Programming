// Write a program to display Fibbonacchi series
//  0   1   1   2   3   5   8   13  21  ...........
//using iteration

import java.util.*;

class program803
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, i = 0;
        long First = 0, Second = 0, Next = 0;

        System.out.println("Enter how many numbers you want to display from Fibbonacchi Series: ");
        iValue = sobj.nextInt();

        for(i = 1, First = 0, Second = 1; i <= iValue; i++)
        {
            System.out.print(First+"\t");
            Next = First + Second;
            
            First = Second;
            Second = Next;
        }

        System.out.println();

        sobj.close();
    }
}