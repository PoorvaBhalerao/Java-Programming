// Assignment74_5.java

import java.security.Permission;
import java.util.Scanner;

class program800
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Amount = 0;
        float DiscountedAmount = 0.0f;
        float FinalAmount = 0.0f;

        String MembershipType = null;
        
        System.out.println("Enter Purchase Amount: ");
        Amount = sobj. nextInt();

        System.out.println("Enter Membership type (Regular/ Premium): ");
        MembershipType = sobj.next();                     // Important

        if( (Amount < 0) || 
            ((MembershipType.equalsIgnoreCase("Premium") == false) && (MembershipType.equalsIgnoreCase("Regular") == false))  )
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Amount > 5000)       // 20 %
        {
            DiscountedAmount = (float)Amount * 0.2f;     // 20 percent discount
            //FinalAmount = (float)Amount - DiscountedAmount;          
        }
        else if(Amount > 2000)  // 10 %
        {
            DiscountedAmount = (float)Amount * 0.1f;     // 10 percent discount
            //FinalAmount = (float)Amount - DiscountedAmount;
        }
        else                    // 0 %
        {
            DiscountedAmount = 0.0f;
            //FinalAmount = (float)Amount - DiscountedAmount;
        }

        FinalAmount = (float)Amount - DiscountedAmount;
        
        if(MembershipType.equalsIgnoreCase("Premium"))
        {
            DiscountedAmount = DiscountedAmount + (FinalAmount  * 0.05f);
            FinalAmount = (float)Amount - DiscountedAmount;
        }

        System.out.println("Original Amount: "+Amount);
        System.out.println("Total Discount: "+DiscountedAmount);
        System.out.println("Final Payable Amount: "+FinalAmount);

        sobj.close();
    }
}