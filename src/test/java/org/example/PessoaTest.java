package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {
    Pessoa pessoa = new Pessoa("gabriel", LocalDate.now().getYear(), "123");
    @Test
    void quando_ano_nascimento_1989_is_maior_idade_true(){
        Pessoa pessoa = new Pessoa("gabriel", 1989, "123"); //MOCK
        Assertions.assertTrue(pessoa.isMaiorIdade());
    }
    @Test
    void quando_ano_nascimento_ano_atual_is_maior_idade_false(){

        Assertions.assertFalse(pessoa.isMaiorIdade());
    }
    @Test
    void quando_set_nome_maior_que_4_caracteres_sucesso(){



        Assertions.assertDoesNotThrow(() -> pessoa.setNome("Maria José"));
    }

    @Test
    void quando_set_nome_for_menor_que_4_falha(){
        Assertions.assertThrows(RuntimeException.class, () -> pessoa.setNome("Mar"));
    }
}
