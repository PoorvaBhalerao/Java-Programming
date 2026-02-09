// File unpacker - 8 (Final File Unpacker with descryptor)
// Accepted packed file and converted Header which is in bytes(100 bytes) to string, trim it and spit name and size
//create new file of that filename and write data to that file which contains encrypted data 
// decrypt data

import java.io.*;
import java.util.*;

class program613
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        //Variable creation

        int FileSize = 0;
        int i = 0;
        int iRet = 0;

        byte Key = 0x11;

        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;                               // packed files object
        File fobj = null;                                   // new files object
        FileInputStream fiobj  = null;
        FileOutputStream foobj = null;
        String Header = null;
        String Tokens[] = null;

        byte bHeader[] = new byte[100];
        byte Buffer[] = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of Packed file: ");
        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if( ! fpackobj.exists())
        {
                System.out.println("There is no such packed file");
                return;
        }
        
        fiobj = new FileInputStream(fpackobj);

        while((iRet = fiobj.read(bHeader, 0, 100)) != -1)
        {
            Header = new String(bHeader);               // byte to String

            System.out.println("Header: "+Header);      // header printing

            Header = Header.trim();                     // triming header

            Tokens = Header.split(" ");          // split header to name and length

            System.out.println("File Name: "+Tokens[0]);
            System.out.println("File Size: "+Tokens[1]);

            fobj = new File(Tokens[0]);

            fobj.createNewFile();

            foobj = new FileOutputStream(fobj);

            FileSize = Integer.parseInt(Tokens[1]);     // converted string to integer

            // Buffer for reading data
            Buffer = new byte[FileSize];         
            
            // reading from packed file
            fiobj.read(Buffer, 0, FileSize);

            // Decryption of data
            for(i = 0; i<FileSize ; i++)
            {
                Buffer[i] = (byte)(Buffer[i] ^ Key);
            }

            // write to extracted file
            foobj.write(Buffer, 0, FileSize);
        }     
    }
}