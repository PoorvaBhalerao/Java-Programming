//Write a program which accepts one number from user and print even factors of that number on screen

import java.util.*;

class Logic
{
    public void Largest(int iNo1, int iNo2, int iNo3)
    {
        int iMax = 0;

        if(iNo1 > iNo2)
        {
            if(iNo1 > iNo3)
            {
                iMax = iNo1;
            }
        }
        else if(iNo2 > iNo3)
        {
            iMax = iNo2;
        }
        else 
        {
            iMax = iNo3;
        }

        System.out.println("Maximum number is "+iMax);
        
    }

}

class practice5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter third number: ");
        int iValue3 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Largest(iValue1, iValue2, iValue3);

        sobj.close();
    }
}