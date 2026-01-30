// File PackerUnpacker - 5


import java.io.*;
import java.util.*;

class program561
{
    public static void main(String[] args) throws Exception    // we can write in try-catch
    {
        String FileName = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);                // file gets created due to this
        
        sobj.close();
    }
}