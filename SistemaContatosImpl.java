import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class SistemaContatosImpl implements SistemaContatos {
    private Map<String, Contato> contatos;

    public SistemaContatosImpl() {
        this.contatos = new HashMap<>();
    }

    @Override
    public boolean cadastraContato(Contato contato) {
        if (contatos.containsKey(contato.getNome())) {
            return false; // Contato já cadastrado
        }
        contatos.put(contato.getNome(), contato);
        return true;
    }

    @Override
    public Contato pesquisaContato(String nome) {
        return contatos.get(nome);
    }

    @Override
    public boolean removeContato(String nome) {
        return contatos.remove(nome) != null;
    }

    @Override
    public Collection<Contato> listaContatos() {
        return contatos.values();
    }
}
