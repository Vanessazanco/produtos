import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Limite do Cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while(sair != 0){
            System.out.println("Digite a descrição da compra : ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da Compra: ");
            double valor = leitura.nextDouble();

            Compras compras = new Compras(descricao,valor);
            boolean compraConfirmada = cartao.lancaCompra(compras);

            if (compraConfirmada){
                System.out.println("Compra confirmada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS APROVADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}