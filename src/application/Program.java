package application;

import entities.ConjuntoPalavrasUnicas;

public class Program {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        palavrasUnicas.adicionarPalavra("Charmander");
        palavrasUnicas.adicionarPalavra("Totodile");
        palavrasUnicas.adicionarPalavra("Vaporeon");
        palavrasUnicas.adicionarPalavra("Tinkatoon");
        palavrasUnicas.adicionarPalavra("Dragonite");
        palavrasUnicas.adicionarPalavra("Meow");
        palavrasUnicas.adicionarPalavra("Gengar");

        try {
            palavrasUnicas.exibirPalavrasUnicas();

            palavrasUnicas.removerPalavra("Totodile");
            palavrasUnicas.exibirPalavrasUnicas();

            System.out.println(palavrasUnicas.verificarPalavra("Pikachu"));
        }
        catch (IllegalStateException e){
            throw new IllegalStateException(e.getMessage());
        }
        catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
