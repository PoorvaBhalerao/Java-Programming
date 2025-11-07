// Accept number from user and calculate its factorial.

import java.util.Scanner;

class Number
{
    public long CalculateFactorial(int iNo)
    {
        int i = 0;
        long lFact = 1;         // Important

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        i = 1;
        while(i <= iNo)         // change
        {
            lFact = lFact * i;
            i++;
        }       

        return lFact;
    }
}//End of Number class

class program89
{
    public static void main(String args[])
    {
        int iValue = 0;
        long lRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();
        
        Number nobj = new Number();
        lRet = nobj.CalculateFactorial(iValue);

        System.out.println("Factorial is "+lRet);
        
        sobj = null;        
        nobj = null;                
        System.gc();        
    }
}