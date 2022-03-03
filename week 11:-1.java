import java.applet.Applet;
import java.awt.Graphics;

public class useparam extends Applet
{
	public void paint(Graphics g)
	{
		int x=0;
		int y=0;
		String msg="";
		x=Integer.parseInt(getParameter("xposition"));
		y=Integer.parseInt(getParameter("yposition"));
		msg=getParameter("msg");
		

		g.drawString(msg,x,y);
	}
}







/*HTML FILE*/
<html>

<body>




<applet code="useparam.class" width="300" height="300">
	<param name="msg" value="this is a parameter example program."/>
	<param name="xposition" value="500"/>
	<param name="yposition" value="500"/>
</applet>
	
</body>

</html>
