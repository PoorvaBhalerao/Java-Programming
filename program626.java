// write a program which accepts a number from user and check whether 3rd bit of that number is ON or OFF.

import java.util.*;

class program626
{
    public static void main(String A[]) 
    {
        int iNo = 0;
        int iMask = 4;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        iResult = iNo & iMask;

        if(iResult == 0)
        {
            System.out.println("3rd bit of given number is OFF");
        }
        else
        {
            System.out.println("3rd bit of given number is ON");
        }

        sobj.close();
    }
}