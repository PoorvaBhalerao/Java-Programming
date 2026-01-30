// File PackerUnpacker - 3
// Create a new file

import java.io.*;
import java.util.*;

class program559
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        boolean bRet = false;
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        bRet = fobj.exists();

        if(bRet == true)
        {
            System.out.println("File is already present");
        }
        else
        {
            bRet = fobj.createNewFile();

            if(bRet == true)                                                // when file gets created
            {
                System.out.println("File gets created successfully");
            }
            else                                                            // if not permission to create file in folder
            {
                System.out.println("Unable to create file");
            }
        }
        
        sobj.close();
    }
}