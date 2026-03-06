////Write a program to check whether a given number is a Triomorphic Number or not
//triomorphic Number is number in which cube of its number ends with that number
// 4 ==> 64(it ends with 4)

import java.util.*;

class program837
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iCube = 0, iCount = 0, iTemp = 0, iDenominator = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        iTemp = iNo;
        iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDenominator = (int)Math.pow(10, iCount);           // Number of digits jevdhe astil tevdhya 10 chya powr ne divide karayche

        if(iCube % iDenominator == iTemp)
        {
            System.out.println("It is a Triomorphic number");
        }
        else
        {
            System.out.println("It is not a Triomorphic numberr");
        }

        sobj.close();
    }
}

