// Accept N numbers from user and accept one another number as NO return Index of last occurence of that NO.

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

    public int Occurence(int NO)
    {
        int iPos = 0;

        for(int i = 0; i<Arr.length; i++)
        {
            if(Arr[i] == NO)
            {
                iPos++;
            }
            else
            {
                iPos++;
            }
            
        }

        return iPos;

    }
}


class practice27
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        System.out.println("Enter a number that you want to check :");
        int iNo = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();

        System.out.println("Last Occurence of number is: "+lobj.Occurence(iNo));

        sobj.close();
    }
}