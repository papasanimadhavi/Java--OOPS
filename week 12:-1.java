import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mouseexample extends Applet implements MouseListener,MouseMotionListener
{
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		showStatus("Mouse clicked at"+e.getX()+","+e.getY());
	}
	public void mouseEntered(MouseEvent e)
	{
		showStatus("Mouse entered at"+e.getX()+","+e.getY());
	}
	public void mouseExited(MouseEvent e)
	{
		showStatus("Mouse exited at"+e.getX()+","+e.getY());
	}
	public void mousePressed(MouseEvent e)
	{
		showStatus("Mouse pressed at"+e.getX()+","+e.getY());
		getText("
	}
	public void mouseReleased(MouseEvent e)
	{
		showStatus("Mouse released at"+e.getX()+","+e.getY());
	}
	public void mouseDragged(MouseEvent e)
	{
		showStatus("Mouse dragged at"+e.getX()+","+e.getY());
	}
	public void mouseMoved(MouseEvent e)
	{
		showStatus("Mouse moved at"+e.getX()+","+e.getY());
	}
}

	
	
