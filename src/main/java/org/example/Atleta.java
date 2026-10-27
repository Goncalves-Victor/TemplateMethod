package org.example;

public abstract class Atleta {

    private int numero;
    protected String nome;
    private float notaDificuldade;
    private float notaExecucao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaDificuldade() {
        return notaDificuldade;
    }

    public void setNotaDificuldade(float notaDificuldade) {
        this.notaDificuldade = notaDificuldade;
    }

    public float getNotaExecucao() {
        return notaExecucao;
    }

    public void setNotaExecucao(float notaExecucao) {
        this.notaExecucao = notaExecucao;
    }

    public float calcularNotaFinal() {
        return this.notaDificuldade + this.notaExecucao;
    }

    public abstract String verificarClassificacao();

    public String getCategoria() {
        return "Atleta";
    }

    public String getInfo() {
        return getCategoria() + " [" +
                "numero=" + this.numero +
                ", nome=" + this.nome +
                ", notaFinal=" + this.calcularNotaFinal() +
                ", situacao=" + this.verificarClassificacao() +
                "]";
    }
}
