// write a program which accepts a number from user and OFF 4th bit of that number.

//  1111    1111    1111    1111    1111    1111    1111    0111
//  f       f       f       f       f       f       f       7
//0xfffffff7        =>Mask

import java.util.*;

class program635
{
    public static void main(String A[]) 
    {
        int iNo = 0, iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        iMask = 0xfffffff7;

        iNo = iNo & iMask;

        System.out.println("Updated number is: "+iNo);
        
    }
}