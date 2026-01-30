// File PackerUnpacker - 7
// read a file

import java.io.*;
import java.util.*;

class program563
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);                    // if file not exists then here we get exception        
        
        frobj.close();
        sobj.close();
    }
}