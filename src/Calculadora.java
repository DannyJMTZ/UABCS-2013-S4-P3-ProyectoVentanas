import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends Ventana implements MouseListener{
	private JTextField operando1;
	private JTextField operando2;
	private JLabel operador;
	private JTextField resultado;
	private OButton suma;
	private OButton resta;
	private OButton multiplicacion;
	private OButton division;
	private OButton igual;
	private JLabel errorOperador;
	private JLabel errorOperando;
	
	public Calculadora(int w, int h, String t) {
		super(w, h, t);
		this.setLayout(null);
		
		// declaracion de los operandos
		operando1 = new JTextField();
		operando1.setBounds(10, 10, 80, 30);
		operando1.setBackground(Color.DARK_GRAY);
		operando1.setForeground(Color.LIGHT_GRAY);
		operando1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		operando1.setToolTipText("Escribe un numero entero");
		this.add(operando1);
		
		operando2 = new JTextField();
		operando2.setBounds(140, 10, 80, 30);
		operando2.setBackground(Color.DARK_GRAY);
		operando2.setForeground(Color.LIGHT_GRAY);
		operando2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		operando2.setToolTipText("Escribe un numero entero");
		this.add(operando2);
		
		// crea el JTextField de el resultado
		resultado = new JTextField();
		resultado.setBounds(250, 10, 80, 30);
		resultado.setBackground(Color.DARK_GRAY);
		resultado.setForeground(Color.LIGHT_GRAY);
		resultado.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.add(resultado);
		
		// operador entre los operandos
		operador = new JLabel("");
		operador.setBounds(112, 10, 30, 30);
		this.add(operador);
		
		// botones de los operadores
		suma = new OButton(10, 50, "+");
		suma.addMouseListener(this);
		this.add(suma);
		
		resta = new OButton(70, 50, "-");
		resta.addMouseListener(this);
		this.add(resta);
		
		multiplicacion = new OButton(130, 50, "*");
		multiplicacion.addMouseListener(this);
		this.add(multiplicacion);
		
		division = new OButton(190, 50, "/");
		division.addMouseListener(this);
		this.add(division);
		
		this.igual = new OButton(250, 50, "=");
		this.igual.addMouseListener(this);
		this.add(this.igual);
		
		// etiqueta de "="
		JLabel igual = new JLabel("=");
		igual.setBounds(230, 10, 30, 30);
		this.add(igual);
		
		// errores
		errorOperador = new JLabel("");
		errorOperador.setBounds(10, 100, 250, 20);
		this.add(errorOperador);
		
		errorOperando = new JLabel("");
		errorOperando.setBounds(10, 120, 250, 20);
		this.add(errorOperando);
		
		this.setVisible(true);
	}

	public void mouseClicked(MouseEvent arg0) { 
		String name = ((OButton)arg0.getComponent()).getText();
		
		if(name.equals("+") || name.equals("-") || name.equals("*")|| name.equals("/")){
			operador.setText(name);
			errorOperador.setText("");
		}
		
		boolean correcto = true;
		int operando1 = 0;
		int operando2 = 0;
		
		try{
			operando1 = Integer.parseInt(this.operando1.getText());
		}catch (NumberFormatException e) {
			correcto = false;
		}

		try{
			operando2 = Integer.parseInt(this.operando2.getText());
		}catch (NumberFormatException e) {
			correcto = false;
		}
		
		if(!correcto)
			errorOperando.setText("Error: uno de los operandos es invalido");
		
		if(operador.getText().equals(""))//error no se a declarado un operador
			errorOperador.setText("Error: no se ha declarado el operador");
			
			
		if(name.equals("=") && correcto){
			errorOperando.setText("");
			
			if(!operador.getText().equals("")){
				errorOperador.setText("");
				switch(operador.getText()){
					case "+":
						resultado.setText("" + 
						(operando1 + operando2));
						break;
					case "-":
						resultado.setText("" + 
						(operando1 - operando2));
						break;
					case "*":
						resultado.setText("" + 
						(operando1 * operando2));
						break;
					case "/":
						resultado.setText("" + 
						(operando1 / operando2));
						break;
				}
			}	
		}
	}
	public void mouseEntered(MouseEvent arg0) { }
	public void mouseExited(MouseEvent arg0) { }
	public void mousePressed(MouseEvent arg0) { }
	public void mouseReleased(MouseEvent arg0) { }

	/*public static void main(String[] args) {
		Calculadora calc = new Calculadora(350, 180, "Calculadora de Enteros");
	}*/
	
}
