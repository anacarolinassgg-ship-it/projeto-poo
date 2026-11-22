package modelo;

public class Revista extends ItemAcervo {
    private int edicao;
    
    @Override
    public int prazoDias(){
        return 7;
    }

    public int getEdicao(){
        return edicao;
    }

    public Revista(int codigo, String titulo, int edicao){
        super(codigo, titulo);
        this.edicao = edicao;
    }

    @Override
    public String toString(){
        String edicaotxt = "Edição" + " " + edicao; 
        return super.toString() + " | " + edicaotxt;
    }
}
