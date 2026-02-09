// write a program which accepts a number and two positions of bit from user toggle that bit of given number.
/*
    iPos1 = 2
    iPos2 = 4
    iNo =       0  1  1  0
    iMask1 =    0  0  1  0      used to handle 2nd pos
    iMask2 =    1  0  0  0      used to handle 4th pos

    iNo = iNo ^ iMask1
        0   1   1   0   iNo
    ^   0   0   1   0   iMask1
    -----------------------------
    =   0   1   0   0   iNo

    iNo = iNo ^ iMask2
        0   1   0   0   iNo
    ^   1   0   0   0   iMask2
    -----------------------------
    =   1   1   0   0   iNo     final iNo

*/
import java.util.*;

class program639
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask1 = 0x1, iMask2 = 0x1, ipos1 =0 , ipos2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter first position of bit: ");    //2
        ipos1 = sobj.nextInt();

        System.out.println("Enter second position of bit: ");   //4
        ipos2 = sobj.nextInt();

        iMask1 =  iMask1 << (ipos1 - 1);                       
        iMask2 =  iMask2 << (ipos2 - 1);                       

        iNo = iNo ^ iMask1;
        iNo = iNo ^ iMask2;

        System.out.println("Updated number is: "+iNo);
        
    }
}