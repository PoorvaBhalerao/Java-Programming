// Write a program to accept a number and find factorial of number

import java.util.*;

class Logic
{
    public int Factorial(int iNo)
    {
        int i = 0;
        int iFact = 1;

        for(i = 1; i<= iNo; i++)
        {
           iFact = iFact * i;
        }
        return iFact;
    }
}


class practice19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        System.out.println("Factorial is: "+lobj.Factorial(iValue));

        sobj.close();
    }
}