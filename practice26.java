// Accept N numbers from user and check whether that numbers contains 11 or not


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

    public boolean Check()
    {
        boolean bFlag = false;
        
        for(int i = 0; i< Arr.length; i++)
        {
            if(Arr[i] == 11)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}


class practice26
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want to enter: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.Accept();
        lobj.Display();
        
        boolean bRet = lobj.Check();

        if(bRet)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.err.println("11 is not present");
        }

        sobj.close();
    }
}