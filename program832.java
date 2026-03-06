////Write a program to check whether a given number is an Automorphic Number or not
//Automorphic Number is number in which square of its number ends with that number
// 25 ==> 625(it ends with 25)
import java.util.*;

class program832
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iSquare = 0, iCount = 0, iTemp = 0, iDenominator = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();

        iTemp = iNo;
        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDenominator = (int)Math.pow(10, iCount);           // Number of digits jevdhe astil tevdhya 10 chya powr ne divide karayche

        if(iSquare % iDenominator == iTemp)
        {
            System.out.println("It is an Automorplic number");
        }
        else
        {
            System.out.println("it is not an Automorphic number");
        }

        sobj.close();
    }
}

