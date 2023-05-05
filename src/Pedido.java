import java.util.ArrayList;

public class Pedido {
    private String status;
    private String dataCompra;
    private double totalPedido;
    ArrayList<String> listaProduto = new ArrayList<String>();

    public void CancelarPedido() {
        System.out.println("Pedido cancelado");
    }

    public void EncerrarPedido() {
        System.out.println("Pedido encerrado");
    }

    public void EmitirNotaPedido(ArrayList<String> listaProduto) {
        System.out.println("Nota fiscal emitida");
    }
}
