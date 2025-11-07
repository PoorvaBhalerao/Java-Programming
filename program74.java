// Accept number from user and display all factors of that number.
//checked exception 

import java.io.BufferedReader;
import java.io.InputStreamReader;

class program74
{
    public static void main(String args[])
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

// error: unreported exception IOException; must be caught or declared to be thrown
//         iNo = Integer.parseInt(bobj.readLine());
//                                             ^
// 1 error
// error: compilation failed