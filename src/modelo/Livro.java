package modelo;

public class Livro extends ItemAcervo {
    private String autor;
    private String isbn;

    @Override
    public int prazoDias(){
        return 14;
    }

    public String getAutor(){
        return autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public Livro (int codigo, String titulo, String autor, String isbn){
        super(codigo, titulo);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override 
    public String toString(){
        return super.toString() + " | " + autor + " | " + isbn;
    }
}
