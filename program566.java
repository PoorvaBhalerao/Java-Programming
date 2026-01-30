// File PackerUnpacker - 10
// read a file

import java.io.*;
import java.util.*;

class program566
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
            
            char Buffer[] = new char[50];
            
            frobj.read(Buffer, 0, 13);

            System.out.println("Data from file: "+ (String)Buffer);                 // Error

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