import java.util.Objects;
import javax.swing.JOptionPane;

public class TelaPrincipal {
    public static void main(String[] args) {

        do {
            try {
                EscolheConversor EscolheConversor = new EscolheConversor();
                EscolheValor EscolheValor = new EscolheValor();

                double valorSelecionado = EscolheValor.getValor();

                if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de moedas")) {
                    EscolheMoedas EscolheMoedas = new EscolheMoedas();
                    new ConverteMoedas(valorSelecionado, EscolheMoedas.getOpcaoSelecionada());
                } else if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de temperaturas")) {
                    EscolheTemperaturas EscolheTemperaturas = new EscolheTemperaturas();
                    new ConverteTemperaturas(valorSelecionado, EscolheTemperaturas.getOpcaoSelecionada());
                } else if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de distâncias")) {
                	EscolheDistancias EscolheDistancias = new EscolheDistancias();
                    new ConverteDistancias(valorSelecionado, EscolheDistancias.getOpcaoSelecionada());
                } else {
                	EscolheConsumoCombustivel EscolheConsumoCombustivel = new EscolheConsumoCombustivel();
                    new ConverteConsumoCombustivel(valorSelecionado, EscolheConsumoCombustivel.getOpcaoSelecionada());
                }
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                new TelaErro("O valor informado é inválido!");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                new TelaErro("Erro... Digite um valor válido!");
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");

        System.exit(0);
    }
}
