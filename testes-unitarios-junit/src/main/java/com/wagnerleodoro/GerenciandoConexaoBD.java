package com.wagnerleodoro;

import java.util.logging.Logger;

public class GerenciandoConexaoBD {
    private static final Logger LOGGER = Logger.getLogger(GerenciandoConexaoBD.class.getName());

    public static String iniciarConexao() {
        LOGGER.info("Conexão iniciada");
        return "Conexão iniciada";
    }
    public static String finalizarConexao() {
        LOGGER.info("Conexão finalizada");
        return "Conexão finalizada";
    }
    public static void inserirDados(Pessoa pessoa) {
        LOGGER.info("Dados inseridos");
    }
    public static void removerDados(Pessoa pessoa) {
        LOGGER.info("Dados removidos");
    }
}
