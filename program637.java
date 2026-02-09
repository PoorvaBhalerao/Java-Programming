// write a program which accepts a number and a position of bit from user and OFF that bit of given number.

// iPos = 14
//  0000    0000    0000    0000    0000    0000    0000    0001    => iMask = 1
//  iMask = iMask << (iPos-1) =>
//  0000    0000    0000    0000    0010    0000    0000    0000    =>0x00002000
//``iMask = ~iMask;         =>
//  1111    1111    1111    1111    1101    1111    1111    1111    =>0xffffdfff



import java.util.*;

class program637
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask = 0x1, ipos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter position of bit: ");
        ipos = sobj.nextInt();

        iMask =  iMask << (ipos-1);                       // in this due to tilda(negate) operator given bit position will be zero and all other bits will be 1 

        iMask = ~iMask;

        iNo = iNo & iMask;

        System.out.println("Updated number is: "+iNo);
        
    }
}