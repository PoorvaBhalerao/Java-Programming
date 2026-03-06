////Write a program to check whether a given number is spy Number or not
//spy Number is number in whichsum of digits of number is equal to product of digits

import java.util.*;

class program833
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo =0, iDigit = 0, iSum = 0, iMult = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        iMult = 1;
        int iTemp = iNo;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iSum = iSum + iDigit;
            iMult = iMult * iDigit;
            
            iNo = iNo / 10;
        }

        if(iSum == iMult)
        {
            System.out.println(iTemp+" is a Spy Number");
        }
        else
        {
            System.out.println(iTemp+" is not a Spy Number");

        }
        
        sobj.close();
    }
}

