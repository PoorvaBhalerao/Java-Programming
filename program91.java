// Accept number from user and display Addition of digits of that number

import java.util.Scanner;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        
        return iSum;
    }
}

class program91
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();
        
        Digit dobj = new Digit();
        iRet = dobj.SumDigits(iValue);

        System.out.println("Addition of digits is "+iRet);
        
        sobj = null;        
        dobj = null;                
        System.gc();        
    }
}