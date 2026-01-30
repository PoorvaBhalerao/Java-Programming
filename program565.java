// File PackerUnpacker - 9
// read a file

import java.io.*;
import java.util.*;

class program565
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        String FileName = null;
        FileReader frobj = null;                     

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            frobj = new FileReader(FileName);  
            
            System.out.println((char)frobj.read());               // this fuction returns only one byte
            System.out.println((char)frobj.read());               
            System.out.println((char)frobj.read());               

        }
        else
        {
            System.out.println("There is no such file");
        }
        
        if(frobj != null)
        {
            frobj.close();
        }
        
        sobj.close();
    }
}