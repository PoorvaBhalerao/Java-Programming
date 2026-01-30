// File PackerUnpacker - 22
// Directory problems

import java.io.*;
import java.util.*;

class progam581
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of folder: ");
        String FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is present");
        }
        else
        {
            System.out.println("There is no such Folder");
        }
    }
}