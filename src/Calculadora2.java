import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora2 extends Ventana implements Operaciones, MouseListener{
	
	private JTextField txt;
	private JLabel lbl;
	private OButton btnSuma, btnResta, btnMulti, btnDivi;
	private float total;
	
	public Calculadora2(int w, int h, String t) {
		super(w, h, t);
		this.setLayout(null);
		
		// declaracion de botones
		btnSuma = new OButton(400, 100, "+");
		btnResta = new OButton(400, 160, "-");
		btnMulti = new OButton(400, 220, "*");
		btnDivi = new OButton(400, 280, "/");
		
		// agrega los MouseListener
		btnSuma.addMouseListener(this);
		
		// agrega los botones a la ventana
		this.add(btnSuma);
		this.add(btnResta);
		this.add(btnMulti);
		this.add(btnDivi);
		
		// declaracion del txt
		this.txt = new JTextField();
		txt.setBounds(50, 100, 250, 50);
		this.add(txt);
		
		// declaracion del lbl
		this.lbl = new JLabel("0");
		lbl.setBounds(50, 10, 250, 50);
		this.add(lbl);
		
		this.setVisible(true);
	}

	public float suma(float a){ 
		
		if( a == 0)
			return 0;
		
		return this.total += a;
	}
	public float resta(float a){ return 0; }
	public float multiplicacion(float a) { return 0; }
	public float division(float a) { return 0; }

	// MouseListener
	public void mouseClicked(MouseEvent arg0) { 
		String operator = ((OButton)arg0.getComponent()).getText();
		
		
		if(operator == "+"){
			// float a = this.suma(Float.parseFloat(txt.getText()));
			this.lbl.setText(Float.toString(this.suma(Float.parseFloat(txt.getText()))));
		}
	}
	public void mouseEntered(MouseEvent arg0) { }
	public void mouseExited(MouseEvent arg0) { }
	public void mousePressed(MouseEvent arg0) { }
	public void mouseReleased(MouseEvent arg0) { }
	
	/*public static void main(String[] args) {
		Calculadora2 c2 = new Calculadora2(500, 500, "Calculadora 2");
	}*/
	
}
