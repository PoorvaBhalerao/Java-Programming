// write a program which accepts a number from user and OFF 4th bit of that number.

import java.util.*;

class program633
{
    public static void main(String A[]) 
    {
        int iNo = 0, iResult = 0, iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        iMask = ~(1 << (4-1));

        iResult = iNo & iMask;

        System.out.println("Result after 4th bit is OFF = "+iResult);
    }
}