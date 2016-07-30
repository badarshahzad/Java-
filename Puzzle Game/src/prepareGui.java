import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class prepareGui extends JFrame implements ActionListener{

	private String string[][]=new String[3][3];
	private JButton jb[][]=new JButton[3][3];
	
	public static void shafflArray(String[] num){
		Random rnd= ThreadLocalRandom.current();
		for(int a=num.length-1;a>0;a--){
			int index = rnd.nextInt(a+1);
			String x=num[index];
			num[index]=num[a];
			num[a]=x;
		}
	}
	public prepareGui(){
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(3,3));
		String[] num={	"1","2","3",
						"4","5","6",
						"7","8"," "};
		
		shafflArray(num);
		
		for(int x=0,c=0;x<3;x++){
			for(int y=0;y<3;y++,c++){
				string[x][y]=num[c];
			}
		}
		
		for(int a=0,c=0;a<3;a++){
			for(int b=0;b<3;b++,c++){
					jb[a][b] = new JButton(string[a][b]);
					if(jb[a][b].getText().equals(" "))
						jb[a][b].setEnabled(false);
					else
						jb[a][b].setEnabled(true);
					jb[a][b].addActionListener(this);
					jp.add(jb[a][b]);
			}
		}
		add(jp);
		setVisible(true);
		setSize(400,400);
		setTitle("Puzzle");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton obj= (JButton)e.getSource();
		int a=0,b=0;
		int f = 0,g=0;
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				if(jb[x][y].getText().equals(" ")){
					a=x;
					b=y;
					break;
					}
				}
			}
		
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(obj.getText().equals(jb[i][j].getText())){
				
							String s=obj.getText();
							jb[i][j].setText(" ");
							jb[a][b].setText(s);
							
							jb[i][j].setEnabled(true);
							jb[a][b].setEnabled(false);
							break;
						}
				
				}
			
			}
		}
}


