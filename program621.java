//Write a program which converts number from decimal to binary and Calculate count of 1.


import java.util.*;

class program621
{
    public static void main(String A[]) 
    {
        int no = 0;
        int iDigit = 0;
        int iCount = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        no = sobj.nextInt();

        while(no != 0)
        {
            iDigit = no % 2;
            // if(iDigit == 0)
            // {
            //     iCount++;
            // } OR
            iCount = iCount + iDigit;
            no = no/2;           
        }
        System.out.println("Count of 1's in binary version of given number is: "+iCount);
    }
}