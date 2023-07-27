package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;

    public int getAnoLancamento() {
        return anoLancamento;
    }

    private int anoLancamento;
    private boolean incluidoPlano;
    private double avaliacao;
    private int totalAvaliacoes;
    private int duracaoMinutos;
    private double somaDasAvaliacoes;

    //MÉTODOS

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
        System.out.println("Incluído no plano: " + incluidoPlano);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
