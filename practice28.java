// Accept N numbers from user and return largest number

import java.util.*;

class Logic
{
    int Arr[];
    int iSize;

    public Logic(int No)
    {
        this.iSize = No;
        this.Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.err.println("Enter Elements:");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        
        System.err.println("Entered Elements are:");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public int Largest()
    {
        int iMax = 0;

        iMax = Arr[0];

        for(int i = 0; i<Arr.length; i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
            
        }

        return iMax;

    }
}


class practice28
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();

        System.out.println("Largest number is: "+lobj.Largest());

        sobj.close();
    }
}