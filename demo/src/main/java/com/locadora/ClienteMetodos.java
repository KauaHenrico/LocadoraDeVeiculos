import java.util.ArrayList;
import java.util.List;

public class ClienteMetodos {
    private List<Cliente> clientes = new ArrayList<>();
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void removerCliente(Cliente cliente) {
        if (cliente.temLocacao()) {
            throw new IllegalArgumentException("Não é possível excluir um cliente atrelado a uma locação.");
        }
        clientes.remove(cliente);
    }
    
    public void editarCliente(Cliente cliente, String nome, String CNH, String telefone) {
        cliente.setNome(nome);
        cliente.setCNH(CNH);
        cliente.setTelefone(telefone);
    }
    
    public Cliente buscarCliente(String CPF) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(CPF)) {
                return cliente;
            }
        }
        return null;
    }
    
    public List<Cliente> listarClientes() {
        return clientes;
    }
    
    public List<Cliente> listarClientesReverso() {
        List<Cliente> listaReversa = new ArrayList<>(clientes);
        Collections.reverse(listaReversa);
        return listaReversa;
    }
}
