// write a program which accepts a number and position from user toggle that bit of given number.
// ipos =5
//iNo =     0100   1101
//iMask =   0001   0000
//-------------------------
//iNo =     0101   1101     XOR
//iMask=    0001   0000     <=iMask << (ipos - 1);
//-----------------------
//          0001   0000     AND

import java.util.*;

class program638
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask = 0x1, ipos =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter position of bit: ");
        ipos = sobj.nextInt();

        iMask =  iMask << (ipos - 1);                       

        iNo = iNo ^ iMask;

        System.out.println("Updated number is: "+iNo);
        
    }
}