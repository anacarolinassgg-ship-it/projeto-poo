package app;

import modelo.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "O nome do vento", "Patrick Rothfuss", "978-8599296493");

        System.out.println(livro1);
        
        System.out.println(livro1.isDisponivel());

        livro1.emprestar();

        System.out.println(livro1.isDisponivel());

        System.out.println(livro1);

        livro1.devolver();

        System.out.println(livro1);
    }
    
}
