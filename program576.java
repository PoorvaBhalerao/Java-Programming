// File PackerUnpacker - 17
// Accept filename from user and read data from that file and display it on screen.......... Final solution

import java.io.*;
import java.util.*;

class progam576
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        int iRet = 0;
        String FileName = null;
        byte Buffer[] = new byte[100];

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);                     // it is not used to create the file

        if(fobj.exists())
        {
            String str = null;

            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer, 0 , iRet);                 // imp
                System.out.print(str);
                str = null;
            }
            System.out.println();
        }
        else
        {
            System.out.println("There is no such file");
        }
        
        sobj.close();
    }
}