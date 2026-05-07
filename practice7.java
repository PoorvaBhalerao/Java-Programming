// Write a program to accept one number from user and print number line till that number

import java.util.*;

class Logic
{
    public void Display(int iNo)
    {
        int i = 0;

        for(i = -iNo; i <= iNo; i++)
        {
            System.out.print(i+"\t");
        }
        System.err.println();
        
    }

}

class practice7
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