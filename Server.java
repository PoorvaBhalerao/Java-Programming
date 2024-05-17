//First server has to compile and run // it is server application // we need two command prompt for client and server
import java.net.*;  // for Socket and ServerSocket
import java.io.*;   // for BufferedReader.
class Server
{
    public static void main(String args[])  //we can write throws Exception ,here are checked exceptions so throws can be used
    {
        try
        {
            System.out.println("Server application is Running...");

            ServerSocket ssobj = new ServerSocket(2100);    //2100 is imaginary
            System.out.println("Server is waiting for client...");

            Socket sobj = ssobj.accept();   //it is used to accept req which is comes from client
            System.out.println("Server gets successfully connected...");

            PrintStream ps = new PrintStream(sobj.getOutputStream());       // when anything entered by servers ps then accepted by clients br1
            BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));   //it accepts what is written by clients ps
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));  //accepts input from servers keyboard
            String str1, str2;

            System.out.println("Marvellous Messenger Started...");

            while((str1 = br1.readLine()) != "end")  // while br1 doents read "end", loop goes on
            {
                System.out.println("Client says:"+str1);
                System.out.println("Enter messege for client: ");
                str2 = br2.readLine();
                ps.println(str2);
            }
            System.out.println("Thank you for using Marvellous Messenger...");
        }
        catch(Exception obj)
        {}
    }
}