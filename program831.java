//Write a program to check whether a given number is a Neon Number or not
//Neon Number is number in which sum of indivisual digits of square of that number  is equal to  that number 
// 9
// 81 = 8+1 = 9


import java.util.*;

class program831
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iTemp = 0, iDigit = 0, iSum = 0;

        System.out.println("Enter Number: ");
        iNo = sobj.nextInt();
        
        iTemp = iNo;

        iNo = iNo * iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Neon Number");
        }
        else
        {
            System.out.println("It is not a Neon Number");
        }

        sobj.close();
    }
}

