//Write a program to check whether a given number is a Pallindrome Number or not
//Pallindronme Number is number which when read reversly then it is equal to the number itself


import java.util.*;

class program829
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

        sobj.close();
    }
}

// iNo = 153, iRev = 0;
//iRet = iRev * 10 + iDigit