public abstract class Produto {
    private String nomeProduto;
    private String desc;
    private double precoUnitario;

    public Produto(String nomeProduto, String desc, double precoUnitario){
        this.nomeProduto = nomeProduto;
        this.desc = desc;
        this.precoUnitario = precoUnitario;
    }

    public void ConsultaProduto(){
        System.out.println( "Nome do produto:" + this.nomeProduto + "\n" +
                            "Descrição:" + this.desc + "\n" +
                            "Preco unitario:" + this.precoUnitario);
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
