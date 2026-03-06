//Write a program to check whether a given number is a Pallindrome Number or not
//Pallindronme Number is number which when read reversly then it is equal to the number itself


import java.util.*;

class program830
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iDigit = 0, iRev = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();
        
        int iTemp = iNo;
        while(iNo != 0)
        {
            iDigit = iDigit % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp == iRev)
        {
            System.out.println(iTemp+" is a Pallindrome Number");
        }
        else
        {
            System.out.println(iTemp+" is not a Pallindrome Number");

        }

        sobj.close();
    }
}

// iNo = 153, iRev = 0;
//iRet = iRev * 10 + iDigit