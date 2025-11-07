//Accept number from user and check whether number is perfect number or not

import java.util.Scanner;

class Number
{
    public Boolean CheckPerfect(int iNo)
    {
        int i = 0, iSum = 0;
        boolean bFlag = false;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        for(i = 1; i <= (iNo/2); i++)
        {
            if((iNo % i) == 0)
            {
                iSum = iSum + i;
            }
        }
        
        if(iSum == iNo)
        {
            bFlag = true;
        }

        return bFlag;
    }
}//End of Number class

class program81
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();
        
        Number nobj = new Number();
        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is a Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is not a Perfect Number");
        }
        
        sobj = null;        
        nobj = null;                
        System.gc();        
    }
}