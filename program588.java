// Encryption Descryption
import java.io.*;
import java.util.*;

class program588
{
    public static void main(String[] args) throws Exception   
    {
        String str = "Hello";

        byte Arr[] = str.getBytes();

        byte Key = 0x11;

        System.out.println("Original data: "+str);

        // Encryption Process
        for(int i = 0; i< Arr.length; i++)
        {
            Arr[i] =(byte)(Arr[i] ^ Key);                       
        }

        String Output = new String(Arr);

        System.out.println("Encrypted data: "+Output);

        // Descryption Process
        for(int i = 0; i< Arr.length; i++)
        {
            Arr[i] =(byte)(Arr[i] ^ Key);                       
        }

        String Out = new String(Arr);

        System.out.println("Decrypted Data: "+Out);
    }
}