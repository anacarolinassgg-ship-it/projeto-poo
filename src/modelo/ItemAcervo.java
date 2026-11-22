package modelo;

public abstract class ItemAcervo {
    private int codigo;
    private String titulo;
    private boolean disponivel;

    public int getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void emprestar (){
        disponivel = false;
    }

    public void devolver (){
        disponivel = true;
    }

    protected ItemAcervo(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        disponivel = true;
    }

    public abstract int prazoDias();

    @Override 
    public String toString(){
        String disponiveltxt = disponivel? "Disponível" : "Emprestado";
        return codigo + " | " + titulo + " | " + disponiveltxt;
    }
}

