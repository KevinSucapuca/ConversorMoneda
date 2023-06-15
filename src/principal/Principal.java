package principal;

import javax.swing.JOptionPane;
import conversor.opcionesConversor;
public class Principal {

	public static void main(String[] args) {
		opcionesConversor conversion = new opcionesConversor();
				
		while (true) {
		    Object opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
		            JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Monedas"}, "Elegir");

		    if (opciones != null) {
		        String opcionSeleccionada = opciones.toString();

		        switch (opcionSeleccionada) {
		            case "Conversor de Monedas":
		                String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");

		                if (input != null && !input.isEmpty()) {
		                    try {
		                        double valorRecibido = Double.parseDouble(input.trim());
		                        conversion.ConvertirMonedas(valorRecibido);

		                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
		                        if (respuesta == JOptionPane.OK_OPTION) {
		                            System.out.println("Entra");
		                        } else {
		                            JOptionPane.showMessageDialog(null, "Programa finalizado");
		                            System.exit(0); // Salir del programa
		                        }
		                    } catch (NumberFormatException e) {
		                        JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numérico válido");
		                    }
		                } else {
		                    JOptionPane.showMessageDialog(null, "Programa finalizado");
		                    System.exit(0); // Salir del programa
		                }
		                break;
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Programa finalizado");
		        System.exit(0); // Salir del programa
		    }
		}
}
}
