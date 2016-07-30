import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PrepareGui{
			
		public JFrame frame=new JFrame();
		public JPanel panel1=new JPanel();
		public JPanel panel2=new JPanel();
		public JTextField text=new JTextField(12);
		public JButton jb[]=new JButton[16];
		final String numButtons[]={"7","8","9","/","4","5","6","*","1","2","3","+","0","-","C","="};
		public PrepareGui(){
			
			panel1.setLayout(new BorderLayout());
			frame.add(panel1);
			text.setText("");
			panel1.add(text, BorderLayout.NORTH);
			panel2.setLayout(new FlowLayout());
			
			Calculation cal = new Calculation(text, jb, numButtons);
			
			for(int a=0;a<numButtons.length;a++){
				 jb[a]=new JButton(numButtons[a]);
				 jb[a].addActionListener(cal);
				 panel2.add(jb[a]);
			}	 

			panel1.add(panel2);
			frame.setVisible(true);
			frame.setSize(200, 200);
			frame.setLayout(new GridLayout(1,1));
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
}
