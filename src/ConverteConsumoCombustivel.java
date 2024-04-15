import javax.swing.JOptionPane;

public class ConverteConsumoCombustivel extends Conversor {

	public ConverteConsumoCombustivel(double valor, String op) {
		converter(valor, op);
		String msg = String.format("O valor convertido é de %.2f %s", super.valorConvertido, super.simboloConversao);
		JOptionPane.showMessageDialog(null, msg);
	}

	@Override
	public void converter(double valor, String op) {
		switch (op) {
		case "De Milha por galão americano mpg EUA para Milhas por galão imperial mpg imp" -> {
			super.simboloConversao = "mpg imp";
			super.valorConvertido = (valor * 1.201);
		}
		case "De Milha por galão americano mpg EUA para Quilômetro por litro km/l" -> {
			super.simboloConversao = "km/l";
			super.valorConvertido = (valor / 2.352);
		}
		case "De Milha por galão americano mpg EUA para Litro por 100 quilômetros l/100 km" -> {
			super.simboloConversao = "l/100 km";
			super.valorConvertido = (235.215 / valor);
		}
		case "De Litro por 100 quilômetros l/100 km para Milha por galão americano mpg EUA" -> {
			super.simboloConversao = "mpg EUA";
			super.valorConvertido = 235.215 / (valor / 100);
		}
		case "De Quilômetro por litro km/l para Milha por galão americano mpg EUA" -> {
			super.simboloConversao = "mpg EUA";
			super.valorConvertido = (valor * 2.352);
		}
		case "De Milhas por galão imperial mpg imp para Milha por galão americano mpg EUA" -> {
			super.simboloConversao = "mpg EUA";
			super.valorConvertido = (valor / 1.201);
		}
		}
	}
}
