import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        // comment this out once you have finished
        drawGrid(g2);
	g2.setColor(Color.black);
	/******** Put your code here  *********/

	int[] x = {25,150,162,162,167,182,187,187,200,325,275,175,75,25};
	int[] y = {100,100,125,75,100,100,75,125,100,100,150,200,150,100};
	
	g2.fillPolygon(x, y, 14);

	Line2D.Double l1 = new Line2D.Double(25, 100, 150, 100);
	g2.draw(l1);
        QuadCurve2D q1 = new QuadCurve2D.Float();
        q1.setCurve(150,100,156.25,125,162.5,125);
        g2.setColor(Color.white);
	g2.fill(q1);
        Line2D.Double l2 = new Line2D.Double(162.5,125,162.5,75);
        g2.draw(l2);
        Line2D.Double l3 = new Line2D.Double(162.5,75,167.5,100);
        g2.draw(l3);
        Line2D.Double l4 = new Line2D.Double(167.5,100,182.5,100);
        g2.draw(l4);
        Line2D.Double l5 = new Line2D.Double(182.5,100,187.5,75);
        g2.draw(l5);
        Line2D.Double l6 = new Line2D.Double(187.5,75,187.5,125);
        g2.draw(l6);
        QuadCurve2D q2 = new QuadCurve2D.Float();
        q2.setCurve(187.5,125,193.75,125,200,100);
        g2.fill(q2);
        Line2D.Double l7 = new Line2D.Double(200,100,325,100);
        g2.draw(l7);
        QuadCurve2D q3 = new QuadCurve2D.Float();
        q3.setCurve(25,100,100,125,75,150);
        g2.fill(q3);
        QuadCurve2D q4 = new QuadCurve2D.Float();
        q4.setCurve(75,150,150,150,175,200);
        g2.fill(q4); 
        QuadCurve2D q5 = new QuadCurve2D.Float();
        q5.setCurve(175,200,200,150,275,150);
        g2.fill(q5);
        QuadCurve2D q6 = new QuadCurve2D.Float();
        q6.setCurve(275,150,250,125,325,100);
        g2.fill(q6);
        
        


        
        




   	
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
	
	
        }
	
    }
}