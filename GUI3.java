import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame("PPA50");      
        fobj.setSize(600, 600);     
        fobj.setVisible(true);      
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj){}   //all these exceptions are copied from compilation of code
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj){}
}

class GUI3
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA50");
    }
}

