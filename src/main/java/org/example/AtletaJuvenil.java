package org.example;

public class AtletaJuvenil extends Atleta {

    public String verificarClassificacao() {
        if (this.calcularNotaFinal() >= 11.0f) {
            return "Classificado";
        }
        else {
            return "Eliminado";
        }
    }

    @Override
    public String getCategoria() {
        return "AtletaJuvenil";
    }
}
