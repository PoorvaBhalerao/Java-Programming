//Accept number from user and check whether it is prime or not

import java.util.*;

class Logic
{
    public void DisplayPrime(int iNo)
    {
        int i = 0;
        boolean bFlag = true;

        for(i = 2; i<=(iNo/2); i++)
        {
           if(iNo % i == 0)
           {
                bFlag = false;
                break;
           }
        }
        
        if(bFlag == true)
        {
            System.err.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
        
        
    }
}


class practice15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayPrime(iValue1);

        sobj.close();
    }
}