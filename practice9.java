// Write a program which accepts N and display first 5 multiples of N.

import java.util.*;

class Logic
{
    public void DisplayOdd(int iNo)
    {
        int i = 0;

        for(i = 1; i <= 5; i++)
        {
            System.out.print(iNo*i+" ");
        }        
    }
}


class practice9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayOdd(iValue);

        sobj.close();
    }
}