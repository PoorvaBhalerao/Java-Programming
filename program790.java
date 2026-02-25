//Matrix codes
//Accept Matrix from user and display summation of all elements from matrix

//iRow = 4; iCol = 4
/*
    11  10  20  15
    17  18  21  14
    25  32  37  90
    80  71  67  53
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
    
}

class program790
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

        sobj.close();
    }
}