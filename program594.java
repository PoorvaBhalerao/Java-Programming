// File Packer - 31

import java.io.*;
import java.util.*;

class program594
{
    public static void main(String A[]) throws Exception    // we can write in try-catch
    {
        String str = "Marvellous Infosystems Pune";

        System.out.println("Data: "+str);
        System.out.println("Length: "+str.length());

        for(int i = str.length(); i< 100; i++)              // 100 is Headers length
        {
            str = str + " ";
        }

        System.out.println("Data: "+str);
        System.out.println("Length: "+str.length());


    }
}