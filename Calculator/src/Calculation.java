import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculation implements ActionListener{

	private JTextField text;
	private JButton[] jb;
	private String [] numButtons;
	private double num1,num2,result;
	private int add=0,sub=0,multi=0,div=0;

	public Calculation(JTextField jt, JButton[] jbt,String numButton[]){ 
		text = jt;
		jb = jbt;
		for(int a=0;a<numButton.length;a++)
		{
			this.numButtons=numButton;
		}
	}


	public void actionPerformed(ActionEvent e){
		JButton source= (JButton)e.getSource();
		
		text.setText(text.getText()+source.getText());
		double result;
		
		if(source.getText().equals("*")){
			num1=Double.parseDouble(text.getText().substring(0,text.getText().length()-1));
			text.setText("");
			add=0;
			sub=0;
			multi=1;
			div=0;
				}

		if(source.getText().equals("+")){
			num1=Double.parseDouble(text.getText().substring(0,text.getText().length()-1));
			text.setText("");
			add=1;
			sub=0;
			multi=0;
			div=0;
				}

		if(source.getText().equals("-")){
			num1=Double.parseDouble(text.getText().substring(0,text.getText().length()-1));
			text.setText("");
			add=0;
			sub=1;
			multi=0;
			div=0;
				}

		if(source.getText().equals("/")){
			num1=Double.parseDouble(text.getText().substring(0,text.getText().length()-1));
			text.setText("");
			add=0;
			sub=0;
			multi=0;
			div=1;
				}
			
		if(source.getText().equals("=")){
			num2=Double.parseDouble((text.getText().substring(0, text.getText().length()-1)));
			text.setText("");
			if(add>0){
				result=num1+num2;
				text.setText(""+result);

			}
			if(sub>0){
				result=num1-num2;
				text.setText(""+result);

			}
			if(multi>0){
				result=num1*num2;
				text.setText(""+result);

			}
			if(div>0){
				result=num1/num2;	
				text.setText(""+result);

			}
		}	
		if(source.getText().equals("C")){
			num1=0;
			num2=0;
			text.setText("");
		}
	
	}
}
	