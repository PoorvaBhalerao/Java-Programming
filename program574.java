// File PackerUnpacker - 17
// read data from file using byte array
// Accept filename from user and read data from that file and display it on screen

import java.io.*;
import java.util.*;

class progam574
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
            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer));
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