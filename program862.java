//Accept String from user and display how many times "india" word is appeared in that string.(case sensitive)


import java.util.*;

class program862
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCount = 0;

        System.out.println("Enter String: ");

        //step 0:
        String str = sobj.nextLine();
        
        // step 1:
        str = str.trim();

        //step 2:
        str = str.replaceAll("\\s+"," ");

        //step 3:
        String Arr[] =str.split(" ");

        //step 4:
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].equals("india") == true)
            {
                iCount++;
            }
        }  

        System.out.println("Count of word 'india' is: "+iCount);
       
        sobj.close();

    }
}
