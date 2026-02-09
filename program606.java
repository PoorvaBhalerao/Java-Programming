// File Packer - 43(Final code of Packer with encryption)
// Accept packed file name and foldername from user and copy contents of all regular files(with extension .txt) from folder to packed file with encryption
// First form the Header , adding white spaces upto 100 bytes 
// add header + (encrypted)data to packed file

import java.io.*;
import java.util.*;

class program606
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        String Header = null;

        byte Key = 0x11;
        int iRet = 0;
        int i = 0, j = 0;

        byte Buffer[] = new byte[1024];

        byte bHeader[] = new byte[100];

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

            for(i =0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                if(fArr[i].getName().endsWith(".txt"))
                {
                    // Header Formation
                    Header = fArr[i].getName()+" "+fArr[i].length();

                    for(j = Header.length(); j< 100; j++)
                    {
                        Header = Header + " ";
                    }
                    
                    bHeader = Header.getBytes();                        // bytes from Header string is converted to byte array

                    // write Header into packed file
                    foobj.write(bHeader, 0, 100);
                    
                    //Read data from Input files from (Marvellous) folder
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        // Encryption Logic
                        for(j = 0; j< iRet ;j++)
                        {
                            Buffer[j] = (byte)(Buffer[j] ^ Key);
                        }

                        // Write the files data to packed file
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