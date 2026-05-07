// Write a program to accept one number from user and print that number times $ & * on screen

import java.util.*;

class Logic
{
    public void Display(int iNo)
    {
        int i = 0;

        for(i = 0; i < iNo; i++)
        {
            System.out.print("$  &  *  ");
        }
        System.err.println();
        
    }

}

class practice6
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Display(iValue);

        sobj.close();
    }
}