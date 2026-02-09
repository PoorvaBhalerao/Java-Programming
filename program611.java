// File unpacker - 5
// Accepted packed file and converted Header which is in bytes(100 bytes) to string, trim it and spit name and size
//create new file of that filename and write data to that file which contains encrypted data

import java.io.*;
import java.util.*;

class program611
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
            //Variable creation

        int FileSize = 0;
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

        // Read the Header
        fiobj.read(bHeader, 0, 100);

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

        Buffer = new byte[FileSize];         
        
        fiobj.read(Buffer, 0, FileSize);

        foobj.write(Buffer, 0, FileSize);





    }
}