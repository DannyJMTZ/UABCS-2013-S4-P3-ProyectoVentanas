import java.awt.Color;

import javax.swing.JButton;


public class OButton extends JButton{
	
	public OButton(int x, int y, String operador){
		this.setFocusable(false);
		this.setBorderPainted(false);
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.LIGHT_GRAY);
		this.setText(operador);
		this.setBounds(x, y, 50, 50);
	}

}
