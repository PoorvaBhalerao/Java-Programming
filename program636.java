// write a program which accepts a number from user and OFF 14th bit of that number.

//  1111    1111    1111    1111    1101    1111    1111    1111
//  f       f       f       f       d       f       f       f
//0xffffdfff        =>Mask

import java.util.*;

class program636
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        iMask = 0xffffdfff;

        iNo = iNo & iMask;

        System.out.println("Updated number is: "+iNo);
        
    }
}