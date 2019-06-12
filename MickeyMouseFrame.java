import javax.swing.JFrame;

public class MickeyMouseFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("MickeyMouseFrame");  //
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 
		frame.setSize(400, 400); //

		MickeyMouse z = new MickeyMouse();
		frame.add(z);

		frame.setVisible(true); //
	}
}
