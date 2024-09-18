package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;

    private List<Livro> livros;


    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void emprestar(Livro livro){
        if(livros.size()>= 3 && !livro.isEmprestado()){
            System.out.println(nome + "Já possui 3 livros emprestados.");
        }else{
            livros.add(livro);
            livro.setEmprestado(true);
            //System.out.println(nome + " Num livro não pode ser emprestado se já estiver emprestado a outro usuário.");
        }

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", livros=" + livros +
                toString() +
                '}';
    }
}
