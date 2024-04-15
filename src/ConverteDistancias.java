import javax.swing.JOptionPane;

public class ConverteDistancias extends Conversor {

    public ConverteDistancias(double valor, String op) {
        converter(valor, op);
        String msg = String.format("O valor convertido é igual a %.2f %s", super.valorConvertido, super.simboloConversao);
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {
        switch (op) {
            case "Metros a Quilômetros" -> {
                super.simboloConversao = "km";
                super.valorConvertido = (valor / 1000);
            }
            case "Metros a Centímetros" -> {
                super.simboloConversao = "cm";
                super.valorConvertido = valor * 100;
            }
            case "Metros a Milímetros" -> {
                super.simboloConversao = "mm";
                super.valorConvertido = valor * 1000;
            }
            case "Quilômetros a Metros" -> {
                super.simboloConversao = "metros";
                super.valorConvertido = valor * 1000;
            }
            case "Centímetros a Metros" -> {
                super.simboloConversao = "metros";
                super.valorConvertido = valor / 100;
            }
            case "Milímetros a Metros" -> {
                super.simboloConversao = "metros";
                super.valorConvertido = valor / 1000;
            }
            
        }
    }
}
