//Accept a number from user as N and print all numbers upto 1 to N

import java.util.*;

class Logic
{
    public void DisplayNumbers(int iNo)
    {
        int i = 0;

        for(i = 1; i<= iNo; i++)
        {
           System.out.print(i+"\t");
        }
        
    }
}


class practice16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayNumbers(iValue);

        sobj.close();
    }
}