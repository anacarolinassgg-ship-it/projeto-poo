package app;

import java.util.ArrayList;
import java.util.List;

import modelo.Dvd;
import modelo.ItemAcervo;
import modelo.Livro;
import modelo.Revista;

public class Main {
    public static void main(String[] args) {

        List<ItemAcervo> acervo = new ArrayList<>();

        acervo.add(new Livro(1, "O nome do vento", "Patrick Rothfuss", "978-8599296493"));
        acervo.add(new Revista(2, "Veja", 105));
        acervo.add(new Dvd(3, "Catch Me If You Can", 141));

        for (ItemAcervo item : acervo){
            System.out.println(item);
            System.out.println("Prazo para devolução: " + item.prazoDias() + " dias" + "\n");
        }
    }
}
