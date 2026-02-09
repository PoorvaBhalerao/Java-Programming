// write a program which accepts a number from user an bit position from user and check whether that bit of given number is ON or OFF.

import java.util.*;

class program633
{
    public static void main(String A[]) 
    {
        int iNo = 0;
        int ipos = 0;
        int iMask = 0x1;            //(0000   0000    0000    0000    0000    0000    0000    0001)
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter Position in range 1 to 32: ");
        ipos = sobj.nextInt();

        iMask = iMask << (ipos-1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println(ipos+"th bit is ON");
        }
        else
        {
            System.out.println(ipos+"th bit is OFF");
        }

        sobj.close();
    }
}