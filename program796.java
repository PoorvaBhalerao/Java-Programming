//Assignment74_1.java


import java.util.*;

class program796
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int TotalDays = 0;
        int Fine = 0;
        
        System.out.println("Enter number of days: ");
        TotalDays = sobj.nextInt();

        if(TotalDays < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(TotalDays <= 7)
        {
            System.out.println("No fine Applicable");
            return;
        }
        else if(TotalDays >= 8 && TotalDays <= 12)
        {
            Fine = (TotalDays - 7) * 5;                         // first 7 days are free
        }
        else if(TotalDays > 12)
        {
            Fine = (5 * 5) + ((TotalDays - 12) * 10);           // for 8 to 12 days fine is 5 and 
                                                                // as we are in else if days are greater than 12 so after 12 fine is 10
        }

        System.out.println("Total fine should be paid: "+Fine);
        sobj.close();

    }
}