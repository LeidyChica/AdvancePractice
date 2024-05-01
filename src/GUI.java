import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
		//como es un numero y se estaba mostrando a traves del dialogo de un string
		//habia que convertirlo a entero con el método parseInt
		
		JOptionPane.showMessageDialog(null, "You're "+age+" years old");

		double height = double.parseInt(JOptionPane.showInputDialog("Enter your Height"));
		//se convierte a double a traves del metodo
		
		JOptionPane.showMessageDialog(null, "You're "+height+" cm tall");
	}

}
