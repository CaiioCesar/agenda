import java.util.Collection;

public interface SistemaContatos {
    boolean cadastraContato(Contato contato);
    Contato pesquisaContato(String nome);
    boolean removeContato(String nome);
    Collection<Contato> listaContatos();
}

