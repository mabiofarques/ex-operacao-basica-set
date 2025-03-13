package entities;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<Palavra> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicas.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        for (Palavra p : conjuntoPalavrasUnicas) {
            if (conjuntoPalavrasUnicas.isEmpty()) {
                throw new IllegalStateException("A coleção está vazia");
            }
            else{
                if (p.getPalavra().equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                    break;
                }
            }
        }
        conjuntoPalavrasUnicas.remove(palavraParaRemover);
    }

    public Palavra verificarPalavra(String palavra) {
        if (conjuntoPalavrasUnicas.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        else {
            for (Palavra p : conjuntoPalavrasUnicas) {
                if (p.getPalavra().equalsIgnoreCase(palavra)){
                   return p;
                }
            }
        }
        throw new RuntimeException("Não tem essa palavra na coleção");
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicas);
    }
}
