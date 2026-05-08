// Write a program which accepts a Number and display its digits in reverse order
//I/P: 5278
//O/P: 8    7   2   5

import java.util.*;

class Logic
{
    public void ReverseDisplay(int iNo)
    {
        int iDigit = 0;

        if(iNo == 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }        
    }
}


class practice17
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.ReverseDisplay(iValue);

        sobj.close();
    }
}