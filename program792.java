//Matrix codes
//Accept Matrix from user and display Average all elements from matrix(DRY policy used)

//iRow = 4; iCol = 4
/*
    1   2   3   4   
    5   6   7   8
    1   2   3   4   
    5   6   7   8
*/
import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
        this.Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of matrix:");

        for(i = 0; i < this.iRow; i++)
        {
            System.out.println("Enter the elements of row "+(i+1));

            for(j = 0; j< this.iCol; j++)
            {
                Arr[i][j]= sobj.nextInt();
            }
        }
        sobj.close();
    }

    public void Display()
    {
        int i = 0, j = 0;
        System.out.println("Elements of Marix are:");

        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j< this.iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int Summation()
    {
        int i = 0, j = 0;
        int iSum = 0;
        
        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j< this.iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }            
        }
        return iSum;
    }

    public float Average()
    {
        int iSum = 0;
        
        iSum = Summation();
        
        return ((float)iSum / (float)(iRow*iCol));
    }
    
}

class program792
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns: ");
        int C = sobj.nextInt();
        
        Matrix mobj = new Matrix(R, C);

        mobj.Accept();
        mobj.Display();

        System.out.println("Summation oof all elements: "+mobj.Summation());
        
        System.out.println("Avarage: "+mobj.Average());



        sobj.close();
    }
}