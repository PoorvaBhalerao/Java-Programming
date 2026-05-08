// Write a program which accepts a Number and check whether it contains 0 or not
//I/P: 5278
//O/P: not contains 0

import java.util.*;

class Logic
{
    public boolean CheckZero(int iNo)
    {
        int iDigit = 0;
        boolean bFlag = false;

        if(iNo == 0)
        {
            bFlag = true;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                bFlag = true;
                break;
            }
            iNo = iNo / 10;
        }  
        
        return bFlag;
    }
}


class practice18
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        boolean bRet = lobj.CheckZero(iValue);

        if(bRet == true)
        {
            System.out.println("Number contains zero");
        }
        else
        {
            System.out.println("Number not contains zero");
        }

        sobj.close();
    }
}