//Write a program which accepts one number from user and print even factors of that number on screen

import java.util.*;

class Logic
{
    public void MultFactors(int iNo)
    {
        if(iNo <= 0)
        {
            return;
        }
        
        int iMult = 1;

        for(int i = 1; i<= (iNo/2); i++)
        {
            if(iNo % i == 0)
            {
                iMult = iMult * i;
            }
            
        }

        System.err.println("Answer: "+iMult);
    }

}

class practice4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj. MultFactors(iValue);

        sobj.close();
    }
}