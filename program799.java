// Assignment74_4.java

import java.util.Scanner;

class program799
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int Units = 0;
        int Amount = 0;

        System.out.println("Enter Units consumed: ");
        Units = sobj.nextInt();

        if(Units < 0)
        {
            System.out.println("Units cannot be negative");
            return;
        }

        if(Units <= 100)
        {
            Amount = Units * 5;
        }
        else if(Units > 100 && Units <= 200)
        {
            Amount = (100 * 5) + ((Units - 100) * 7);
        }
        else if(Units > 200)
        {
            Amount = (100 * 5) + (100 * 7) + (Units - 200) * 10;
        }

        System.out.println("Total Units Consumed : "+Units);
        System.out.println("Total Electricity Bill: "+Amount);

        sobj.close();
    }
}