// Accept number from user and display all factors of that number.
//using BufferedReader

import java.io.*;

class program76
{
    public static void main(String args[]) throws IOException   // Not a good programming practice
    {
        int iNo = 0;
        int i = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number: ");

        iNo = Integer.parseInt(bobj.readLine());
              
        
        for(i = 1; i <= (iNo/2); i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}

