//Write a program to check whether a given number is a Armstrong Number or not-----------------------Final code***
//Armstrong number is if sum of each digit raised to power of total digits is equal to number itself.
//153
//1^3 + 5^3 + 3^3 = 153
//1234
//1^4 + 2^4 + 3^4 + 4^4 = something => not Armstrong

import java.util.*;

class program827
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iCount = 0 , iDigit = 0,iTemp = 0, ipow = 0, iSum = 0 ;
        String str = null;

        System.out.println("Enter Number: ");
        iNo = sobj. nextInt();

        iTemp = iNo;

        iCount = Integer.toString(iNo).length();                    // *****

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            //Count Power
            ipow = (int)Math.pow(iDigit, iCount);

            iSum = iSum + ipow;

            iNo = iNo / 10;
        }
        
        if(iSum == iTemp)
        {
            System.out.println(iTemp + " is a Armstrong Number");
        }
        else
        {
            System.out.println(iTemp+ " is not a Armstrong Number");
        }
        
        sobj.close();
    }
}