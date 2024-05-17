import java.io.*;   //we have to import io because we have to use that

class Binput
{
    public static void main(String Arg[])
    {
        // InputStreamReader iobj = new InputStreamReader(System.in);
        // BufferedReader bobj = new BufferReader(iobj);

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = bobj.readLine();

        System.out.println("Welcome : "+name);
    }

}
//IOException occurs

//Binput.java:13: error: unreported exception IOException; must be caught or declared to be thrown
//String name = bobj.readLine();
//^
//1 error