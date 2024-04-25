package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void quando_salario_1000_bonus_igual_1100(){
        Gerente mockGerente = new Gerente("gabriel", 1989, "111");
        mockGerente.setSalario(1000);
        Assertions.assertEquals(1100, mockGerente.getBonus());
    }


}