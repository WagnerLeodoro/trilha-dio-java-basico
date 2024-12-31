package junit;

import com.wagnerleodoro.GerenciandoConexaoBD;
import com.wagnerleodoro.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AfterBeforeTest {
    @BeforeAll
    static void configurarConexao(){
        GerenciandoConexaoBD.iniciarConexao();
    }
    @BeforeEach
    void inserirDadosParaTeste() {
        GerenciandoConexaoBD.inserirDados(
                new Pessoa("Carlos", LocalDate.of(1990, 1, 1))
        );
    }
    @AfterEach
    void removerDadosParaTeste() {
        GerenciandoConexaoBD.removerDados(
                new Pessoa("Carlos", LocalDate.of(1990, 1, 1))
        );
    }

    @Test
    void validarDadosDeRetorno() {
        String resultado = GerenciandoConexaoBD.iniciarConexao();
        assertEquals("Conexão iniciada", resultado);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciandoConexaoBD.finalizarConexao();
    }
}
