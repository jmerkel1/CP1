
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class MickeyMouse extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(circle);

		Graphics2D g2a = (Graphics2D) g;

		Ellipse2D.Double circle1 = new Ellipse2D.Double(50, 50, 100, 100);
		g2a.fill(circle1);

		Graphics2D g2b = (Graphics2D) g;

		Ellipse2D.Double circle2 = new Ellipse2D.Double(250, 50, 100, 100);
		g2b.fill(circle2);
	}
}
