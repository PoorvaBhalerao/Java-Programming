import java.awt.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame("PPA50");      
        fobj.setSize(600, 600);     
        fobj.setVisible(true);      
    }
}


class GUI2
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA50");
    }
}

// to close window type cntl+C on command prompt