import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;


public class ClaseComponentes extends Ventana {
	
	private JButton btnPrueba;
	
	
	public ClaseComponentes(int w, int h, String t){
		super(w,h,t);
		btnPrueba = new JButton("Botón Prueba");
		
		//FlowLayout fl = new FlowLayout();
		//BorderLayout bl = new BorderLayout();
		//GridLayout gl = new GridLayout(1, 10, 10, 50); // rows, colums, espacioX, espacioY
		
		// LAYOUT CON BOXES
		Box izq = Box.createVerticalBox();
		ButtonGroup grupoRadio = new ButtonGroup();
		JRadioButton rButton;
		
		grupoRadio.add((rButton) = new JRadioButton("Azul"));
		izq.add(rButton);
		
		grupoRadio.add((rButton) = new JRadioButton("Rojo"));
		izq.add(rButton);
		
		grupoRadio.add((rButton) = new JRadioButton("Verde"));
		izq.add(rButton);
		
		grupoRadio.add((rButton) = new JRadioButton("Amarillo"));
		izq.add(rButton);
		
		Box der = Box.createVerticalBox();
		der.add(new JCheckBox("Hola!"));
		der.add(new JCheckBox("Hi!"));
		der.add(new JCheckBox("Salut!"));
		
		Box arriba = Box.createHorizontalBox();
		arriba.add(izq);
		arriba.add(der);
		
		Container content = this.getContentPane();
		content.add(arriba);
		
		//content.setLayout(gl);
		
		/*for(int i = 0; i < 10; i++){
			content.add(new JButton("Botón: " + (i+1)));
		}*/
		
		/*
		 * content.add(new JButton("Este"), BorderLayout.EAST);
		 * content.add(new JButton("Oeste"), BorderLayout.WEST);
		 * content.add(new JButton("Centro"), BorderLayout.CENTER);
		 * content.add(new JButton("Norte"), BorderLayout.NORTH);
		 * content.add(new JButton("Sur"), BorderLayout.SOUTH);
		 * */
		
	}
	
	/*public static void main(String[] args) {
		
		ClaseComponentes cc = new ClaseComponentes(500,500,"demo");
		
	}*/

}
