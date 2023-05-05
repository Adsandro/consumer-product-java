import java.util.ArrayList;
public class ProdutoFisico extends Produto implements Cadastravel {
    private String localEstoque;
    public ProdutoFisico (String nomeProduto, String desc, double precoUnitario, String localEstoque){
        super(nomeProduto, desc, precoUnitario);
            this.localEstoque = localEstoque;
    }

    public String getLocalEstoque() {
        return localEstoque;
    }

    public void setLocalEstoque(String localEstoque) {
        this.localEstoque = localEstoque;
    }

    @Override
    public void Cadastrar(ArrayList<Produto> listaProduto, Produto produto){
        listaProduto.add(produto);
    }

    @Override
    public void Remover(ArrayList<Produto> listaProduto ,Produto produto){
        listaProduto.remove(produto);
    }
}
