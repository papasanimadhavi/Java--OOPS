import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class colorgraphics extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(300,150,200,100);
		g.setColor(Color.yellow);
		g.fillRect(300,150,200,100);
		g.setColor(Color.magenta);
		g.drawString("Rectangle",50,50);
	}
}

                                                                                                                                             

/*<applet code="colorgraphics.class" width="300" height="300">
</applet>*/







































import java.applet.*;
import java.awt.*;

public class week11 extends Applet
{
	public void paint(Graphics g)
	{
		int rval,gval,bval;
		int i,j;
		for(j=30;j<(size().height-25);j+=30)
		{
			for(i=5;i<(size().height-25);i+=30)
			{
				rval=(int)Math.floor(Math.random()*256);
				gval=(int)Math.floor(Math.random()*256);
				bval=(int)Math.floor(Math.random()*256);
				g.setColor(new Color(rval,gval,bval));
				g.fillRect(i,j,25,25);
				g.setColor(Color.black);
				g.drawRect(i-1,j-1,25,25);
			}
		}
	}
}


/*<applet code="week11.class" width="300" height="300">
</applet>*/


