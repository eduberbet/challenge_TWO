import javax.swing.JOptionPane;
public class EscolheConsumoCombustivel {

    private final String opcaoSelecionada;

    public EscolheConsumoCombustivel() {
        String[] opcoes = {
        		"De Milha por galão americano mpg EUA para Milhas por galão imperial mpg imp",
        		"De Milha por galão americano mpg EUA para Quilômetro por litro km/l",
        		"De Milha por galão americano mpg EUA para Litro por 100 quilômetros l/100 km",
        		"De Litro por 100 quilômetros l/100 km para Milha por galão americano mpg EUA",
        		"De Quilômetro por litro km/l para Milha por galão americano mpg EUA",
        		"De Milhas por galão imperial mpg imp para Milha por galão americano mpg EUA"   
        };

        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha o conversor de combustível para o qual deseja converter:",
                "Combustível", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return opcaoSelecionada;
    }
}
