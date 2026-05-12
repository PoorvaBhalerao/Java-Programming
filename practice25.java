// Accept N numbers from user and find difference between frequency of even numbers and odd numbers


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

    public int Difference()
    {
        int iCount1 = 0,  iCount2 = 0;

        for(int i = 0; i< Arr.length;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iCount1 += Arr[i];
            }
            else
            {
                iCount2 += Arr[i];
            }
        }

        return (iCount1 - iCount2);
    }
}


class practice25
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();
        lobj.Display();
        System.out.println("Difference between frequency of even elements and odd eleements is: "+lobj.Difference());

        sobj.close();
    }
}