

import java.awt.*;
import java.awt.event.*;
public class MyRectangle extends MyShape
{



MyRectangle()
{
x2=0;
x1=y1=y2=x2;
c1=Color.black;
fil=false;
}
public void draw(Graphics g)
{
System.out.println("rectangle");
g.setColor(c1);
int width=x2-x1;
int height=y2-y1;

if(width<0)
{
width=-(width);
}
if(height<0)
{
    height=-(height);
}
if(fil==true)
g.fillRect(x1,y1,width,height);
else
g.drawRect(x1,y1,width,height);
}
}

