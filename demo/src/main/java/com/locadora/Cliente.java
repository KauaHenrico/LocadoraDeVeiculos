import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private String nome;
    private String CNH;
    private String telefone;
    private String CPF;
    private List<Locacao> locacoes = new ArrayList<>();
    
    // construtor e getters/setters omitidos
    
    public boolean temLocacao() {
        return !locacoes.isEmpty();
    }
    
    public void addLocacao(Locacao locacao) {
        locacoes.add(locacao);
    }
    
    public void removeLocacao(Locacao locacao) {
        locacoes.remove(locacao);
    }
    
    public List<Locacao> getLocacoes() {
        return Collections.unmodifiableList(locacoes);
    }
}

