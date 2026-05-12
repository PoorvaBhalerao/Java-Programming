// write a program to check whether number is pallindrome or not

import java.util.*;

class Logic
{
    public boolean CheckPallindrome(int iNo)
    {
        int iDigit = 0;
        boolean bFlag = false;
        int Original = iNo;
        int Reverse = 0;

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
            Reverse = (Reverse * 10) + iDigit;
            iNo = iNo / 10;
        }  
        
        if(Reverse == Original)
        {
            bFlag = true;
        }
        
        return bFlag;
    }
}


class practice21
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        boolean bRet = lobj.CheckPallindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is pallindrome");
        }
        else
        {
            System.out.println("Number is not pallindrome");
        }

        sobj.close();
    }
}