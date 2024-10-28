public class Contato {
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Contato(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
