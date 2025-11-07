// Accept number from user and display digits of that number in reverse order.

import java.util.Scanner;

class Digit
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class program90
{
    public static void main(String args[])
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();
        
        Digit dobj = new Digit();
        dobj.DisplayDigits(iValue);
        
        sobj = null;        
        dobj = null;                
        System.gc();        
    }
}