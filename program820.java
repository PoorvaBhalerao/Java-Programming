//Write a program to check whether a given number is a Armstrong Number or not
//Armstrong number is if sum of each digit raised to power of total digits is equal to number itself.
//153
//1^3 + 5^3 + 3^3 = 153
//1234
//1^4 + 2^4 + 3^4 + 4^4 = something => not Armstrong

import java.util.*;

class program820
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iCount = 0 , iDigit = 0;

        System.out.println("Enter Number: ");
        iNo = sobj. nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        System.out.println(iCount);
        
        
        sobj.close();
    }
}