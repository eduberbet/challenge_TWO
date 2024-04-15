import javax.swing.JOptionPane;
public class EscolheTemperaturas {

    private final String opcaoSelecionada;

    public EscolheTemperaturas() {
        String[] opcoes = {
                "De Celsius °C para Fahrenheit °F",
                "De Fahrenheit °F para Celsius °C",
                "De Celsius °C para Kelvin K",
                "De Kelvin K para Celsius °C"
        };

        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a temperatura para a qual deseja converter:",
                "Temperaturas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
}
