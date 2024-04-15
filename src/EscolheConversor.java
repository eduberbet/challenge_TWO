
import javax.swing.JOptionPane;

public class EscolheConversor {

    private final String[] opcoes = { "Conversor de moedas", "Conversor de temperaturas", "Conversor de distâncias", "Conversor consumo de combustível"};
    private final int opcaoSelecionada;
    public EscolheConversor() {

       opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione o conversor:",
               "Conversores", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
               opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcoes[this.opcaoSelecionada];
    }
}
