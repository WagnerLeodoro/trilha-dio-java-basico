package junit;

import com.wagnerleodoro.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

public class PessoaTest {

    @Test
    void validadeCalculoIdade() {
        Pessoa pessoa = new Pessoa("Carlos", LocalDate.of(1990, 1, 1));
        assertEquals(34, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeMaiorIdade() {
        Pessoa wagner = new Pessoa("Carlos", LocalDate.of(1990, 1, 1));
        assertTrue(wagner.isMaiorIdade());

        Pessoa maria = new Pessoa("Maria", LocalDate.of(2018, 1, 1));
        assertFalse(maria.isMaiorIdade());

        List<Pessoa> pessoas = List.of(
                new Pessoa("João", LocalDate.of(2000, 1, 1)),
                new Pessoa("José", LocalDate.of(2010, 1, 1)),
                new Pessoa("Maria", LocalDate.of(2015, 1, 1))
        );

        assertAll("pessoas",
            () -> assertTrue(pessoas.get(0).isMaiorIdade()),
            () -> assertFalse(pessoas.get(1).isMaiorIdade()),
            () -> assertFalse(pessoas.get(2).isMaiorIdade())
        );
    }

}
