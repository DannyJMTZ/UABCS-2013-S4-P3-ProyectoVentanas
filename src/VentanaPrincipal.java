import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	final static Color BG = Color.white;
	final static Color FG = Color.black;
	
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	
	/*public static void main(String[] args) {
		
		VentanaPrincipal mainFrame = new VentanaPrincipal();
		
		// crea el tamaño de la ventana
		mainFrame.setSize(500, 500);
		
		// pone un titulo a la ventana
		mainFrame.setTitle("Mi Ventana Principal");
		
		// quita los bordes de la ventana
		//mainFrame.setUndecorated(true);
		
		// pone la ventana en medio de la pantalla
		mainFrame.setLocationRelativeTo(null);
		
		// no puedes modificar el tamaño de la ventana
		mainFrame.setResizable(false);
		
		// pone color de fondo
		mainFrame.setBackground(BG);
		
		// pone color enfrente
		mainFrame.setForeground(FG);
		
		// hace que cuando cierres la ventana se termina la aplicacion
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// hace visible a la ventana
		mainFrame.setVisible(true);
	}*/

}
