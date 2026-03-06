//Write a program to check whether a given number is a Strong Number or not
//Strong number is if sum of factorials of each digit is equal to number itself.

import java.util.*;

class program814
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iDigit = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }


        sobj.close();
    }
}