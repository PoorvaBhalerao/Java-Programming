// aceept a number and display number of digits of that number.

import java.util.*;

class Logic
{
    public int CalculateDigits(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo == 0)
        {
            return 1;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }        

        return iCount;
    }
}


class practice20
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        System.out.println("Number of digits of number are: "+lobj.CalculateDigits(iValue));

        sobj.close();
    }
}