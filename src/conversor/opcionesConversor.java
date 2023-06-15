package conversor;

import javax.swing.JOptionPane;

public class opcionesConversor {
	
convertirMoneda monedas = new convertirMoneda();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De soles a Dólar", "De Dólares a Soles", "De Soles a Euros", "De Euros a Soles"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De soles a Dólar": 
		monedas.ConvertirSolesADolares(valor);
		break;
	
	case "De Dólares a Soles": 
		monedas.ConvertirDolaresASoles(valor);
		break;
		
	case "De Soles a Euros":
		monedas.ConvertirSoleAEuros(valor);
		break;
		
	case "De Euros a Soles":
		monedas.ConvertirEurosASoles(valor);
		break;
		
	
	}

}
}