// Assinment80_1

/*Example
                        Days
            0       1       2       3       4       5       6                           Total
Cities  0   11      10      15      20      19      50      40  Pune                =>  165
        1   200     105     108     102     90      41      42  Mumbai              =>  688
        2   19      10      15      90      80      51      10  Satara              =>  275
        3   15      18      90      97      20      26      28  Sangli              =>  294
            ||      ||      ||      ||      ||      ||      ||
Total       245     143     228     309     209     108     120
*/

import java.util.*;

class program808
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Cities: ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[N][7];
        int i = 0, j = 0, no = 0;

        System.out.println("Enter Electricity Consumption of each City: ");

        for(i = 0; i < N; i++)
        {
            System.out.println("Enter Consumption of City "+(i+1)+": ");
            for(j = 0; j < 7; j++)
            {
                no = sobj.nextInt();

                if(no < 0)
                {
                    System.out.println("Invalid Input");
                    return;
                }
                Arr[i][j] = no;
            }
        }
        
        int Weekly[] = new int[7];                      // weekly Consumption
        int HighestCity = 0;
        int MaxWeeekly = 0;

        int PeekDay = 0;
        int MaxDayTotal = 0;
        int Sum = 0;

        // Weekly Total + Highest COnsumption

        for(i = 0; i< N; i++)
        {
            Sum = 0;
            for(j = 0; j < 7; j++)
            {
                Sum = Sum + Arr[i][j];

            }
            Weekly[i] = Sum;                    // each cities total weekly consumption is stored

            if(Sum > MaxWeeekly)
            {
                MaxWeeekly = Sum;
                HighestCity = i;
            }
        }
        
        System.out.println("Highest Comsumption: City "+HighestCity);
        System.out.println("Highest Weekly Consumption: "+MaxWeeekly);

        int DaySum = 0;
        int Day = 0;
        // Day with Maximum COnsumption

        for(Day = 0; Day< 7; Day++)
        {
            DaySum = 0;
            for(i = 0; i < N; i++)
            {
                DaySum = DaySum + Arr[i][Day];

                if(DaySum > MaxDayTotal)
                {
                    MaxDayTotal = DaySum;
                    PeekDay = Day;
                }
            }
        }

        System.out.println("Peak Consumption day: "+(PeekDay));
       
        System.out.println("Weekly Consumption: ");
        for(i = 0 ; i< N; i++)
        {
            System.out.println("City: "+(i+1)+": "+Weekly[i]);
        }

        // Cities More than 500 units of COnsumption

        System.out.println("Cities more than 500 units Consumption: ");
        for(i = 0; i<N; i++)
        {
            if(Weekly[i] > 500)
            {
                System.out.println("City: "+(i+1));
            }
        }

        sobj.close();
    }
}