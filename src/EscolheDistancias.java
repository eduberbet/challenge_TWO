import javax.swing.JOptionPane;

public class EscolheDistancias {

    private final String opcaoSelecionada;

    public EscolheDistancias() {
        String[] opcoes = {
        		"Metros a Quilômetros",
				"Metros a Centímetros",
				"Metros a Milímetros",
				"Quilômetros a Metros",
				"Centímetros a Metros",
				"Milímetros a Metros"
        };

        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a distância para a qual deseja converter:",
                "Distâncias", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
}
