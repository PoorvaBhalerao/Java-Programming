
class Wrapper
{
    public static void main(String args[]) 
    {
        Integer iobj = new Integer(11);
        int no = 11;

        Integer i = no;         //Autoboxing

        int j = iobj.intValue();    //Unboxing

        System.out.println(j);      // 11
    }
}

/*
    premitiva datatype              Wrapper class

    char                            Character
    int                             Integer
    float                           Float
    short                           Short
    double                          Double
    long                            Long
    byte                            Byte
*/