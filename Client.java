// it is client application // we need two command prompt for client and server
import java.net.*;
import java.io.*;
class client
{
    public static void main(String args[])      //we can write throws Exception ,here are checked exceptions so throws can be used
    {
        try
        {
            System.out.println("Client application is Running...");

            
            Socket sobj = new Socket("localhost", 2100);   // it is used to req server
            System.out.println("Client gets successfully connected...");

            PrintStream ps = new PrintStream(sobj.getOutputStream());   // when anything entered by clients ps then accepted by servers br1
            BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));    //it accepts what is written by servers ps
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));          //accepts input from clients keyboard
            String str1, str2;

            System.out.println("Marvellous Messenger Started...");

            while(!(str1 = br2.readLine()).equals("end"))   // while br2 doesnt read "end", loop goes on
            {
                ps.println(str1);
                str2 = br1.readLine();
                System.out.println("Server says: "+str2);
                System.out.println("Enter messege for server: ");
            }
            System.out.println("Thank you for using Marvellous Messenger...");
        }
        catch(Exception obj)
        {}
    }
}
