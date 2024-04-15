import javax.swing.JOptionPane;

public class ConverteTemperaturas extends Conversor {

    public ConverteTemperaturas(double valor, String op) {
        converter(valor, op);
        String msg = String.format("O valor convertido é de %.2f %s", super.valorConvertido, super.simboloConversao);
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {
        switch (op) {
            case "De Celsius °C para Fahrenheit °F" -> {
                super.simboloConversao = "°F";
                super.valorConvertido = (valor * (9.0 / 5.0)) + 32;
            }
            case "De Fahrenheit °F para Celsius °C" -> {
                super.simboloConversao = "°C";
                super.valorConvertido = (valor - 32) * (5.0 / 9.0);
            }
            case "De Celsius °C para Kelvin K" -> {
                super.simboloConversao = "K";
                super.valorConvertido = valor + 273.15;
            }
            case "De Kelvin K para Celsius °C" -> {
                super.simboloConversao = "°C";
                super.valorConvertido = valor - 273.15;
            }
        }
    }
}
