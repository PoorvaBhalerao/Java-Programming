// Write a program to accept range from user(two numbers) and display that range in reverse order
//I/p: 2    5
//O/p: 5    4   3   2

import java.util.*;

class Logic
{
    public void RevDisplay(int iNo1, int iNo2)
    {
        int i = 0;

        if(iNo1 > iNo2)
        {
            System.err.println("Enter valid input");
            return;
        }

        for(i = iNo2; i >= iNo1; i--)
        {
           System.out.print(i+"\t");
        }          
        
    }
}


class practice12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Ending number: ");
        int iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.RevDisplay(iValue1, iValue2);

        sobj.close();
    }
}