// File PackerUnpacker - 4
// Delete a file

import java.io.*;
import java.util.*;

class program560
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
            fobj.delete();
            System.out.println("File gets deleted successfully");
        }
        else
        {
            System.out.println("There is no such file");
        }
        
        sobj.close();
    }
}