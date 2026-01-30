// File PackerUnpacker - 21
// Directory problems

import java.io.*;
import java.util.*;

class progam580
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of folder: ");
        String FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Folder is present");
        }
        else
        {
            System.out.println("There is no such Folder");
        }
    }
}