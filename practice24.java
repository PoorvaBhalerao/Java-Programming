//Accept N numbers from user and return frequecy of even numbers

import java.util.*;

class Logic
{
    int Arr[];
    int iSize;

    public Logic(int No)
    {
        this.iSize = No;
        this.Arr = new int[this.iSize];
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

    public int EvenFrequency()
    {
        int iCount = 0;

        for(int i = 0; i< Arr.length;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}


class practice24
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();
        lobj.Display();
        System.out.println("Number of even elements are: "+lobj.EvenFrequency());

        sobj.close();
    }
}