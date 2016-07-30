import javax.swing.JFrame;

public class DrawLine {

	public static void main(String[] args) {
		//creating a pannel that contains our drawing
		PanelToDraw panel= new PanelToDraw();
		
		//creating a new frame
		JFrame jf=new JFrame();
		
		jf.add(panel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setSize(400, 400);

	}

}
