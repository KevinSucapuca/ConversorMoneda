package conversor;

import javax.swing.JOptionPane;

public class convertirMoneda {
	
	public void ConvertirSolesADolares(double valor) {
		double monedaDolar = valor / 3.65;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirDolaresASoles(double valor) {
		double monedaSoles = valor * 3.65;
		monedaSoles = (double)Math.round(monedaSoles * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
	public void ConvertirSoleAEuros(double valor) {
		double monedaEuro = valor / 3.99;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes € " + monedaEuro + " Euros");
	}
	public void ConvertirEurosASoles(double valor) {
		double monedaSoles = valor * 3.99;
		monedaSoles = (double)Math.round(monedaSoles * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
	

}
