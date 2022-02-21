import javax.swing.*;

final class Start {
    private Start() {

    }

    public static void main(final String[] args) {
        double soma = 0D;

        for (int i = 0; i < 10; ) {
            final String input = JOptionPane.showInputDialog(null, "Insira um número (Exemplo: 1 ou 5.9):", null, JOptionPane.INFORMATION_MESSAGE);

            if (input == null) {
                return;
            }

            /*
             Tenta converter a entrada do número do usuário de String (texto) para double (número real) e
             guarda na variável local valor.
             Se o usuário errar a entrada, o programa o alertará e a entrada de dados da vez será reiniciada.
            */
            final double valor;

            try {
                valor = Double.parseDouble(input);
            } catch (final NumberFormatException e) {
                JOptionPane.showMessageDialog(null, String.format("\"%s\" não é um número reconhecido.", input));
                continue;
            }

            // Caso o valor for menor do que quarenta, ele será somado à variável valor.
            if (valor < 40D) {
                soma += valor;
            }

            i++;
        }

        JOptionPane.showMessageDialog(null, String.format("Valor final da soma efetuada: %.2f", soma), null, JOptionPane.INFORMATION_MESSAGE);
    }
}
