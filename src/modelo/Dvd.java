package modelo;

public class Dvd extends ItemAcervo{
    private int duracao;

    @Override
    public int prazoDias(){
        return 3;
    }

    public int getDuracao(){
        return duracao;
    }

    public Dvd (int codigo, String titulo, int duracao){
        super(codigo, titulo);
        this.duracao = duracao;
    }

    @Override 
    public String toString(){
        String duracaotxt = duracao + " " + "min";
        return super.toString() + " | " + duracaotxt;
    }
}
