package ProjetoLivro;

public class Pessoa {

    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        this.idade += 1;
    }

    //Métodos Getter, Setter e Construtor

    public String getPessoa() {
        return nome;
    }

    public void setPessoa(String pessoa) {
        this.nome = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}
