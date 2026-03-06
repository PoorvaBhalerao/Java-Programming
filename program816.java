//Write a program to check whether a given number is a Strong Number or not--------------Final code
//Strong number is if sum of factorials of each digit is equal to number itself.

import java.util.*;

class program816
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iFact = 0, i = 0, iTemp = 0, iSum = 0, iDigit = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            // Factorial logic
            iFact = 1;
            for(i = 1; i<= iDigit; i++)
            {
                iFact = iFact * i;
            }
            iSum = iSum + iFact;
            
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is a Strong Number");
        }
        else
        {
            System.out.println("It is not a Strong Number");
        }
        
        sobj.close();
    }
}