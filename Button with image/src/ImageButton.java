import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ImageButton extends JFrame implements ActionListener{
	
	JPanel jp;
	JButton jb;
	JButton jb1;
	public void FrameWork() throws IOException{
		
		//jb=new JButton(new ImageIcon("bRook.png"));
		jb1=new JButton(new ImageIcon("bRook.png"));
		BufferedImage buttonIcon = ImageIO.read(new File("images.png"));
	    jb = new JButton(new ImageIcon(buttonIcon));
		
		jb.addActionListener(this);
		jb.setBackground(Color.BLACK);
		jb.setFocusPainted(false);
		
		jb1.addActionListener(this);
		jb1.setBackground(Color.white);
		jb1.setFocusPainted(false);
		
		jp=new JPanel();
		jp.add(jb);
		jp.add(jb1);
		add(jp);
		
		setTitle(" Image Buttons");
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws IOException{
		ImageButton kk=new ImageButton();
		kk.FrameWork();
		//kk.ImageButton();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		System.out.println("this is button : "+ obj);
		
	}
	

}
