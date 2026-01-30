// File PackerUnpacker - 25
// Directory problems
// Accept packed file name from user and foldername from user and copy contents of files from folder to that file

import java.io.*;
import java.util.*;

class program585
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of folder: ");
        String FolderName = sobj.nextLine();

        System.out.println("Enter name of packed file: ");
        String PackName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File PackObj = new File(PackName);

            PackObj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(PackObj);

            FileInputStream fiobj = null;

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in folder are: "+fArr.length);

            for(int i =0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);
                System.out.println("File Name: "+fArr[i].getName()+" | File Size: "+fArr[i].length()+ " bytes");

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0 , iRet);
                }

                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such Folder");
        }
    }
}