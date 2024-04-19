package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void quando_salario_100_bonus_10(){
        Funcionario funcionario = new Funcionario(
                "Maria",
                1989,
                "111");
        funcionario.setSalario(1000);
        Assertions.assertEquals(100, funcionario.getBonus());
    }
}
