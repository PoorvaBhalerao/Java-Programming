// File PackerUnpacker - 18
// Accept two files from user and copy contents of source file to destination file

import java.io.*;
import java.util.*;

class progam577
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        int iRet = 0;

        String str = null;

        File fobjSrc = null;
        File fobjDest = null;

        String FileNameSrc = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1024];                     // 1 KB

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the Source file : ");
        FileNameSrc = sobj.nextLine();

        fobjSrc = new File(FileNameSrc);                     

        if(fobjSrc.exists())
        {
            System.out.println("Enter the name of the Destination file : ");
            FileNameDest = sobj.nextLine();

            fobjDest = new File(FileNameDest);   
            fobjDest.createNewFile();                  

            FileInputStream fiobj = new FileInputStream(fobjSrc);
            FileOutputStream foobj = new FileOutputStream(fobjDest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0 , iRet);                          // Important
            }
            System.out.println("File copied Successfully");
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no Source file");
        }
        
        sobj.close();
    }
}