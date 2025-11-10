// OOP Design

import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        System.out.println("Inside Constructor");
        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter Elements of Array: ");

        for(i = 0; i< Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of Array are: ");
        int i = 0;
        for(i = 0; i< Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }


}


class program106
{
    public static void main(String[] args) 
    {
        ArrayX aobj1 = new ArrayX(5);
        System.out.println(aobj1.iSize);        // Error

        //Bad programming (need of proper access specifier)
        aobj1.iSize = 11;                       // Error
        aobj1.Arr = null;                       // Error

        ArrayX aobj2 = new ArrayX(7);
        System.out.println(aobj2.iSize);        // Error

        

        aobj2 = null;
        aobj1 = null;

        System.gc();
    }
}

// program106.java:48: error: iSize has private access in ArrayX
//         System.out.println(aobj1.iSize);
//                                 ^
// program106.java:51: error: iSize has private access in ArrayX
//         aobj1.iSize = 11;
//              ^
// program106.java:52: error: Arr has private access in ArrayX
//         aobj1.Arr = null;
//              ^
// program106.java:55: error: iSize has private access in ArrayX
//         System.out.println(aobj2.iSize);
//                                 ^
// 4 errors
// error: compilation failed