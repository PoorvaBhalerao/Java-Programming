class ArrayDemo1
{
    public static void main(String Arg[])
    {
        int Arr[] = {10, 20, 30, 40, 50};//allowed
        //int Arr[5] = {10, 20, 30, 40, 50};//error not allowed size should not given because dynamic memory allocated

        int Arr[] = new int[]{10, 20, 30, 40, 50};//allowed
        
        System.out.println("Number of elements in array are: "+Arr.length);

        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);
        System.out.println(Arr[4]);       
    }
}