import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class panel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(5,30,40,50);
		g.drawOval(70,10,50,20);
		g.drawRect(50,40,100,30);
		g.drawRoundRect(10,50,30,80,50,70);
		g.drawArc(70,10,50,20,40,50);
		g.fillRect(60,80,60,80);
	}
}
class myframe extends JFrame
{
	public myframe()
	{
		setSize(500,400);
		setTitle("Geometric shapes");
		panel p=new panel();
		getContentPane().add(p);
	}
}
class fillshapes
{
	public static void main(String args[])
	{
		myframe ob=new myframe();
		ob.show();
	}
}
