// write a program which accepts a number from user and check whether 8th bit of that number is ON or OFF.

import java.util.*;

class program628
{
    public static void main(String A[]) 
    {
        int iNo = 0;
        int iMask = 0x00000080;            // 8th bit position ( 0000    0000    0000    0000    0000    0000    1000    0000)
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("8th bit of given number is ON");
        }
        else
        {
            System.out.println("8th bit of given number is OFF");
        }

        sobj.close();
    }
}