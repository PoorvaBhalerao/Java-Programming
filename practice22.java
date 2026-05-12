// aceept a number and calculate sum of all digits of number.

import java.util.*;

class Logic
{
    public int SumOddDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        if(iNo == 0)
        {
            return 0;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 1)
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }        

        return iSum;
    }
}


class practice22
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        System.out.println("Sum of Odd digits of number is: "+lobj.SumOddDigits(iValue));

        sobj.close();
    }
}