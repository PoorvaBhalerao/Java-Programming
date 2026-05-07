//Write a program which accepts one number from user and print even factors of that number on screen

import java.util.*;

class Logic
{
    public void DisplayEvenFactors(int iNo)
    {
        if(iNo <= 0)
        {
            return;
        }
        
        for(int i = 1; i<= (iNo/2); i++)
        {
            if(iNo % i == 0 && i%2 == 0)
            {
                System.err.println(i+"\t");
            }
            
        }
    }

}

class practice2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayEvenFactors(iValue);

        sobj.close();
    }
}