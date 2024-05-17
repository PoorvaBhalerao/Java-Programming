
class StringCompare
{
    public static void main(String Arg[])
    {
        String s1 = "Hello";
        String s2 = "Demo";
        String s3 = new String("Hello");
        String s4 = "Hello";

        if(s1 == s4)    // == is comparison operator which is gives answer in yes or no
        {               // == operator not comparing String's content it will compare Strings Hashcodes
            System.out.println("s1 ans s4 are same");
        }

        if(s1 == s3)
        {
            System.out.println("s1 ans s3 are same");
        }

        if(s1.equals(s3))   // equals() method compares the contents
        {
            System.out.println("S1 and s3 are same using equals method");
        }
    }
}