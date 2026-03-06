// Assignment74_2.java

import java.util.Scanner;

class program797
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please enter your current balance: ");
        int Current_Balance = sobj. nextInt();
 
        System.out.println("Please enter amount that you want to withdraw: ");
        int Withdraw_Amount = sobj. nextInt();

        if(Current_Balance < 0 || Withdraw_Amount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Withdraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdrawl amount must be a multiple of 100");
            return;
        }
        else if(Withdraw_Amount > 25000)
        {
            System.out.println("Transaction Failed: Maximum amount per transaction is Rs 25000");
            return;
        }
        else if((Current_Balance - Withdraw_Amount) < 1000)
        {
            System.out.println("Transaction Failed: After withdrawl, Balance must remain at least Rs 1000");
            return;
        }
        else
        {
            Current_Balance = Current_Balance - Withdraw_Amount;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: Rs "+Current_Balance);
        }

        sobj.close();

    }
}