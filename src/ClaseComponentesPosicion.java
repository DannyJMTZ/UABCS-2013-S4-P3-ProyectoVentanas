import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ClaseComponentesPosicion extends Ventana implements MouseListener{
	
	private JButton btn;
	private JTextField txt;
	private JLabel lbl;
	
	public ClaseComponentesPosicion(int w, int h, String t) {
		super(w, h, t);
		this.setLayout(null);
		
		btn = new JButton("Done");
		btn.setBounds(310, 9, 100, 30); // x, y, ancho del boton, alto del boton
		btn.addMouseListener(this);
		// btn.addMouseListener(new MiNuevoListener());
		// se crea otra clase en la misma clase implementando a un MouseListener
		// y solo instanceas para hacer más facil el listener
		
		// 1.- implementar el listener en la misma clase
		// 2.- crear una clase para implementar el listener instanciandola
		// 3.- crear la interfaz en el mismo addMouseListener **como abajo**
		/*btn.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) { }
			public void mouseEntered(MouseEvent arg0) { }
			public void mouseExited(MouseEvent arg0) { }
			public void mousePressed(MouseEvent arg0) { }
			public void mouseReleased(MouseEvent arg0) {}
		});*/
		
		btn.setFocusable(false);
		btn.setBorderPainted(false);
		this.add(btn);
		
		txt = new JTextField();
		txt.setBounds(10, 10, 300, 30);
		this.add(txt);
		
		lbl = new JLabel("ETIQUETA D:");
		lbl.setBounds(10, 50, 300, 50);
		this.add(lbl);
		
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		lbl.setText(txt.getText());
		// System.out.printf("CLICKED\nX: %d\nY: %d\n", arg0.getX(), arg0.getY());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) { 
		 // System.out.printf("PRESSED\nX: %d\nY: %d\n", arg0.getX(), arg0.getY());
	}

	@Override
	public void mouseExited(MouseEvent arg0) { }

	@Override
	public void mousePressed(MouseEvent arg0) { }

	@Override
	public void mouseReleased(MouseEvent arg0) { }
	
	/*public static void main(String[] args) {	
		ClaseComponentesPosicion ccp = new ClaseComponentesPosicion(500, 500, "demo");
	}*/
}
