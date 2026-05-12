//Write a program to check whether number is perfect number or not

import java.util.*;

class Logic
{
    public boolean CheckPerfect(int iNo)
    {
        boolean bFlag = false;
        int iSum = 0;

        if(iNo == 0)
        {
            return bFlag;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int i = 1; i<=(iNo/2) ;i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == iNo)
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }
        
        return bFlag;
    }
}


class practice23
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        boolean bRet = lobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Perfect number");
        }
        else
        {
            System.out.println("Number is not a Perfect number");
        }

        sobj.close();
    }
}