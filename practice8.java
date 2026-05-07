// Write a program to accept one number from user and display all odd numbers upto that number.

import java.util.*;

class Logic
{
    public void DisplayOdd(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo; i++)
        {
            if(i % 2 == 1)
            {
                System.out.println(i+"\t");
            }
        }        
    }

}

class practice8
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayOdd(iValue);

        sobj.close();
    }
}