import java.io.*;   //we have to import io because we have to use that in BufferedReader

class BinputX
{   
    
        public static void main(String Arg[])
        {
            try{
                // InputStreamReader iobj = new InputStreamReader(System.in);
                // BufferedReader bobj = new BufferedReader(iobj);

                BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter your name: ");
                String name = bobj.readLine();      //readine() it is used to accept string from user

                System.out.println("Welcome : "+name);
            }
        
            catch(IOException obj)
            {}
        }
}