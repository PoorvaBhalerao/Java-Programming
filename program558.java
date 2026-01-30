// File PackerUnpacker - 2
// Create a new file

import java.io.*;
import java.util.*;

class program558
{
    public static void main(String[] args)  throws Exception    // we can write in try-catch
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        boolean bRet = fobj.createNewFile();                       // creates new file

        if(bRet == true)
        {
            System.out.println("File gets created successfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }
        
        sobj.close();
    }
}