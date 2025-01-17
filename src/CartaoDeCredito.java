import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;

    private List<Compras> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo= limite - saldo;
        this.compras= new ArrayList<>();
    }
public boolean lancaCompra(Compras compra){
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
}
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
    public List<Compras> getCompras() {
        return compras;
    }

}
