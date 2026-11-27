package modelo;

public class Usuario {
    private int matricula;
    private String nome;
    private TipoUsuario perfil;

    public int getMatricula(){
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public TipoUsuario getPerfil(){
        return perfil;
    }

    public int getLimite(){
        return perfil.getLimiteEmprestimos();
    }

    public Usuario(int matricula, String nome, TipoUsuario perfil){
        this.matricula = matricula;
        this.nome = nome;
        this.perfil = perfil;
    }

    @Override 
    public String toString(){
        String limitetxt =  "Limite de emprestimos: " + getLimite();
        return matricula + " | " + nome + " | " + perfil + " | " + limitetxt;
    }

}
