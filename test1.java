import java.sql.*;

class Test1
{
    public static void main(string arg[])
    {
        try
        {
            Connection cobj = DriverManager.getConnection("path","username","password");

            Statement sboj = cobj.createStatement();

            ResultSet robj = sobj.executeQuery("select * from student");

            while (robj.next())
            {
                System.out.println(robj.getInt("rno"));
                System.out.println(robj.getString("name"));
                System.out.println(robj.getString("city"));                
            }
        }
        catch(Exeption obj)
        {}
    }
}