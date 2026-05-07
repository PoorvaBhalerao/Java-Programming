// Write a program which accepts number and display below pattern
//I/P: 5
//O/p: *    *   *   *   *   #   #   #  #    #

import java.util.*;

class Logic
{
    public void Display(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo; i++)
        {
            System.out.print("*\t");
        }   
        
        for(i = 1; i <= iNo; i++)
        {
            System.out.print("#\t");
        }       
    }
}


class practice10
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Display(iValue);

        sobj.close();
    }
}