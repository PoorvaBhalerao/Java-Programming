// File PackerUnpacker - 1
// Create a new file
// File class contains every metadata which is required to perform operations on file

import java.io.*;
import java.util.*;

class program557
{
    public static void main(String[] args)  throws Exception    // we can write in try-catch
    {
        File fobj = new File("Demo.txt");

        boolean bRet = fobj.createNewFile();                       // creates new file

        if(bRet == true)
        {
            System.out.println("File gets created successfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }
    }
}