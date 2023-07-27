package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {

        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
