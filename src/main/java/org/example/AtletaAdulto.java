package org.example;

public class AtletaAdulto extends Atleta {

    public String verificarClassificacao() {
        if (this.calcularNotaFinal() >= 13.0f && this.getNotaExecucao() >= 7.0f) {
            return "Classificado";
        }
        else {
            return "Eliminado";
        }
    }

}
