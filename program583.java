// File PackerUnpacker - 24
// Directory problems

import java.io.*;
import java.util.*;

class program583
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

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in folder are: "+fArr.length);

            for(int i =0; i<fArr.length; i++)
            {
                System.out.println("File Name: "+fArr[i].getName());
                System.out.println("File Name: "+fArr[i].length());
            }
        }
        else
        {
            System.out.println("There is no such Folder");
        }
    }
}