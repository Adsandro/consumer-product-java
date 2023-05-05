public class Cliente {
    private String nome;
    private String cpf;
    private String endEntrega;

    public void mostraDados(){
        System.out.println("nome: " + this.nome +
                ", cpf: " + this.cpf +
                ", endereço de entrega: " + this.endEntrega);
    }

    public Cliente(String nome, String cpf, String endEntrega){
        this.nome = nome;
        this.cpf = cpf;
        this.endEntrega = endEntrega;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndEntrega() {
        return endEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndEntrega(String endEntrega) {
        this.endEntrega = endEntrega;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
