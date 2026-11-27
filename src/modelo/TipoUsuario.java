package modelo;

public enum TipoUsuario {
    ALUNO(3),
    PROFESSOR(10);

    private final int limiteEmprestimos;

    TipoUsuario(int limite){
        this.limiteEmprestimos = limite;
    }

    public int getLimiteEmprestimos(){
        return limiteEmprestimos;
    }
}
