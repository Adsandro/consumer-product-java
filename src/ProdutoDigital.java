import java.util.ArrayList;

public class ProdutoDigital extends Produto implements Cadastravel {
    private String chaveSerial;

    public ProdutoDigital(String nomeProduto, String desc, double precoUnitario, String chaveSerial) {
        super(nomeProduto, desc, precoUnitario);
        this.chaveSerial = chaveSerial;
    }

    public void Cadastrar(ArrayList<Produto> listaProduto, Produto produto) {
        listaProduto.add(produto);
    }

    public void Remover(ArrayList<Produto> listaProduto, Produto produto) {
        listaProduto.remove(produto);
    }

    public void setChaveSerial(String chaveSerial) {
        this.chaveSerial = chaveSerial;
    }

    public String getChaveSerial() {
        return this.chaveSerial;
    }
}
