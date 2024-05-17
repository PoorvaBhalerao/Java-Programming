import java.io.*;   //we have to import io because we have to use that

class BinputXX
{   
    
    public static void main(String Arg[])
    {
        try
        {
            // InputStreamReader iobj = new InputStreamReader(System.in);
            // BufferedReader bobj = new BufferReader(iobj);

            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter First Number: ");
            int No1 = Integer.parseInt(bobj.readLine());    //convert string to integer

            System.out.println("Enter Second Number: ");
            int No2 = Integer.parseInt(bobj.readLine());

            int Ans = No1 + No2;
            System.out.println(Ans);
        }
        
        catch(IOException obj)
        {}
    }
}