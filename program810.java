// Assignment79_2

import java.util.*;

class program810
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Rows in theatre: ");
        int R = sobj.nextInt();

        System.out.println("Enter Number of Columns in theatre: ");
        int C = sobj.nextInt();

        if(R <= 0 || C <=  0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Seats[][] = new int[R][C];

        int i = 0, j = 0;

        System.out.println("Enter Booking Details (0/1)(0 for empty, 1 for Booked):");

        for(i = 0; i< R; i++)
        {
            System.out.println("Enter Details of Row "+(i+1));
            for(j = 0; j< C; j++)
            {
                Seats[i][j] = sobj.nextInt();

                if(Seats[i][j] != 0 && Seats[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }
        sobj.close();
    }
}