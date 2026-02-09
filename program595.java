// File Packer - 32

import java.io.*;
import java.util.*;

class program595
{
    public static void main(String A[]) throws Exception    // we can write in try-catch
    {
        String str = "A.txt 10";

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