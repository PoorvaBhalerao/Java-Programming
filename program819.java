//Write a program to check whether a given number is a Strong Number or not--------------Final code *****
//Strong number is if sum of factorials of each digit is equal to number itself.

import java.util.*;

class program819
{

    public static boolean CheckStrong(int iNo)
    {
        int iTemp = 0, iSum = 0, iDigit = 0;

        iTemp = iNo;
                    //  0   1   2   3   4     5       6       7       8       9
        int FactArr[] ={1,  1,  2,  6 , 24 ,  120,    720,    5040,   40320,  362880};
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iSum = iSum + FactArr[iDigit];

            if(iSum > iTemp)
            {
                break;
            }
            
            iNo = iNo / 10;
        }
        
        return(iSum == iTemp);
        
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Number: ");
        iValue = sobj.nextInt();

        bRet = CheckStrong(iValue);

        if(bRet)
        {
            System.out.println(iValue+" is a Strong Number");
        }
        else
        {
            System.out.println(iValue+" is not a Strong Number");
        }

        sobj.close();
    }
}