import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelToDraw extends JPanel
	{
		 //draws an x from the corners of the panel
		public void paintComponent(Graphics g)
		{
			//call paintcommoonent to ensure the panel displays correctly
			super.paintComponent(g);
			int width=getWidth();
			int height=getHeight();
			
			//draw a line from the upper left to the lower-right
			// here we will give values like x,y,x,y
			for(int a=0;a<10;a++){
			g.drawLine(a, a, width, height);
			g.drawLine(a, height,width, a);
		
			}
		}
}
