package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaAdultoTest {

    @Test
    void deveClassificarComNotaFinalTrezeEExecucaoSete() {
        AtletaAdulto atleta = new AtletaAdulto();
        atleta.setNotaDificuldade(6.0f);
        atleta.setNotaExecucao(7.0f);
        assertEquals("Classificado", atleta.verificarClassificacao());
    }

    @Test
    void deveEliminarComNotaFinalAbaixoDeTreze() {
        AtletaAdulto atleta = new AtletaAdulto();
        atleta.setNotaDificuldade(5.5f);
        atleta.setNotaExecucao(7.0f);
        assertEquals("Eliminado", atleta.verificarClassificacao());
    }

    @Test
    void deveEliminarComExecucaoAbaixoDeSeteMesmoComNotaFinalAlta() {
        AtletaAdulto atleta = new AtletaAdulto();
        atleta.setNotaDificuldade(7.0f);
        atleta.setNotaExecucao(6.5f);
        assertEquals("Eliminado", atleta.verificarClassificacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AtletaAdulto atleta = new AtletaAdulto();
        atleta.setNumero(7);
        atleta.setNome("Diego");
        atleta.setNotaDificuldade(6.0f);
        atleta.setNotaExecucao(7.5f);
        assertEquals("Atleta [numero=7, nome=Diego, notaFinal=13.5, situacao=Classificado]", atleta.getInfo());
    }
}
