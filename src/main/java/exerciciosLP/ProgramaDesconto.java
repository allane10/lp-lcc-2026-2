package exerciciosLP;
import javax.swing.JOptionPane;

public class ProgramaDesconto {
    public static void main(String[] args) {

        String valorCompraStr = JOptionPane.showInputDialog("Qual o valor da compra? ");
        double valorCompra = Double.parseDouble(valorCompraStr);
        String descontoStr = JOptionPane.showInputDialog("Valor percentual do desconto: ");
        double desconto = Double.parseDouble(descontoStr);
        double valorComDesconto = valorCompra - (valorCompra* (desconto/100));
        String valorComDescontoFormatado = "%.2f".formatted(valorComDesconto);
        JOptionPane.showMessageDialog(null, "Você pagará na compra R$ "+ valorComDescontoFormatado);

    }
}
