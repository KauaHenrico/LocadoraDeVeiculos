public class Aluno {
    String nome;
    int idade;
    float nota;
    public Aluno(String nome, int idade, float nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public float getNota(){
        return nota;
    }
    public void setNota(float nota){
        this.nota = nota;
    }
}
