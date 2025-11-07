// Accept number from user and display all factors of that number.

import java.util.Scanner;

class program73
{
    public static void main(String args[])
    {
        int iNo = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        iNo = sobj.nextInt();
        
        for(i = 1; i <= (iNo/2); i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
        sobj.close();
    }
}