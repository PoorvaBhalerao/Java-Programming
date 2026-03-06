// Assignment79_2

import java.util.*;

class program813
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

        int TotalBooked = 0;
        int MaxBookedInRow = 0;
        int RowWithMax = 0;
        boolean FullRowExists = false;
        int RowBooked = 0;

        for(i = 0; i < R; i++)
        {
            RowBooked = 0;
            for(j = 0 ; j < C; j++)
            {
                if(Seats[i][j] == 1)
                {
                    TotalBooked++;
                }

                RowBooked = RowBooked + Seats[i][j];
            }

            if(RowBooked > MaxBookedInRow)
            {
                MaxBookedInRow = RowBooked;
                RowWithMax = i;
            }

            if(RowBooked == C)
            {
                FullRowExists = true;
            }
        }

        System.out.println("Total Booked Seats: "+TotalBooked);
        System.out.println("Row with Maximum Bookings: "+(RowWithMax+1));
        System.out.println("Full Row Exists: "+(FullRowExists ? "Yes" : "No"));

        System.out.println("Seat Layout of Theatre: ");

        for(i = 0 ; i< R; i++)
        {
            for(j = 0 ; j<C ; j++)
            {
                System.out.print("\t"+((Seats[i][j] == 1) ? "Book" : "Free"));
            }
            System.out.println();
        }

        sobj.close();
    }
}