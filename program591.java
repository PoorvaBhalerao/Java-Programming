// File PackerUnpacker - 28(packer with encryption)
// Write Encrypted data
// Accept packed file name and foldername from user and copy contents of all regular files(with extension .txt) from folder to packed file with encryption

import java.io.*;
import java.util.*;

class program591
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        byte Key = 0x11;
        int iRet = 0;
        int i = 0, j = 0;

        String FolderName = null;
        String PackName = null;
        byte Buffer[] = new byte[1024];

        Scanner sobj = null;
        File fobj = null;
        File PackObj = null;
        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter name of folder: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter name of packed file: ");
        PackName = sobj.nextLine();
        
        fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            PackObj = new File(PackName);

            PackObj.createNewFile();

            foobj = new FileOutputStream(PackObj);

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in folder are: "+fArr.length);

            for(i =0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);
                System.out.println("File Name: "+fArr[i].getName()+" | File Size: "+fArr[i].length()+ " bytes");

                if(fArr[i].getName().endsWith(".txt"))
                {
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        // Encryption Logic
                        for(j = 0; j< iRet ;j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ Key);
                        }

                        foobj.write(Buffer, 0 , iRet);
                    }
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