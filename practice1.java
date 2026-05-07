//Write a program which accepts one number from user and pint that number of even numbers on screen

import java.util.*;

class Logic
{
    public void DisplayEven(int iNo)
    {
        if(iNo <= 0)
        {
            return;
        }
        
        for(int i = 1, j = 2; i<= iNo; i++, j = j+2)
        {
            System.err.println(j+"\t");
        }
    }

}

class practice1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayEven(iValue);

        sobj.close();
    }
}