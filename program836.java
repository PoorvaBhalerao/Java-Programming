//Write a program to check whether a given number is Disarium Number or not
//Disarium Number is sum of digits raised to their posiiton(starting from 1)equal to that number
//135 = 1^1 + 3^2 + 5^3 = 135
import java.util.*;

class program836
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo =0, iDigit = 0, iTemp = 0, iSum = 0, iCount = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }
        
        iNo = iTemp;

        // 135
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + ((int)Math.pow(iDigit, iCount));
            iCount--;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println(iTemp+" is a Disarium Number");
        }
        else
        {
            System.out.println(iTemp+" is not a Disarium Number");

        }

        sobj.close();
    }
}

