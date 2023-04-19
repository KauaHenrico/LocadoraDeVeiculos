import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private String nome;
    private String CNH;
    private String telefone;
    private String CPF;
    private List<Locacao> locacoes = new ArrayList<>();
    
    // construtor
    public Cliente(String nome, String CNH, String telefone, String CPF) {
        this.nome = nome;
        this.CNH = CNH;
        this.telefone = telefone;
        this.CPF = CPF;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNH() {
        return this.CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    

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

