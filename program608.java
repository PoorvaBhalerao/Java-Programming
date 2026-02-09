// File unpacker - 2
// Accepted packed file and converted Header which is in bytes(100 bytes) to string, trim it and spit name and size
//create new file of that filename

import java.io.*;
import java.util.*;

class program608
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
            //Variable creation
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        FileInputStream fiobj  = null;
        String Header = null;

        byte bHeader[] = new byte[100];

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








    }
}