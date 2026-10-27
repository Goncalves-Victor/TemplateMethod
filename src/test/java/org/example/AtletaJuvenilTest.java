package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaJuvenilTest {

    @Test
    void deveClassificarComNotaFinalOnze() {
        AtletaJuvenil atleta = new AtletaJuvenil();
        atleta.setNotaDificuldade(4.0f);
        atleta.setNotaExecucao(7.0f);
        assertEquals("Classificado", atleta.verificarClassificacao());
    }

    @Test
    void deveEliminarComNotaFinalAbaixoDeOnze() {
        AtletaJuvenil atleta = new AtletaJuvenil();
        atleta.setNotaDificuldade(4.0f);
        atleta.setNotaExecucao(6.5f);
        assertEquals("Eliminado", atleta.verificarClassificacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AtletaJuvenil atleta = new AtletaJuvenil();
        atleta.setNumero(12);
        atleta.setNome("Rebeca");
        atleta.setNotaDificuldade(4.0f);
        atleta.setNotaExecucao(6.5f);
        assertEquals("AtletaJuvenil [numero=12, nome=Rebeca, notaFinal=10.5, situacao=Eliminado]", atleta.getInfo());
    }
}
