package com.com470.validadorExtranjeria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorExtranjeriaTest {
    @Test
    void TestElCIExtranjeriaTiene10Caracteres() {
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        boolean resultado = validadorExtranjeria.validar("E-12345678");
        assertTrue(resultado);
    }

    @Test
    void TestElCIExtranjeriaTieneMenos10Caracteres() {
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        boolean resultado = validadorExtranjeria.validar("E-1234567");
        assertFalse(resultado);
    }

    @Test
    void TestElCIExtranjeriaEsNull() {
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        assertThrows(NullPointerException.class, () -> validadorExtranjeria.validar(null));
    }

    @Test
    void TestElCIExtranjeriaTiene10CaracteresyE() {
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        boolean resultado = validadorExtranjeria.validar("E-34567890");
        assertTrue(resultado);
    }

    @Test
    void testValidarCIExtranjero(){
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        assertTrue(validadorExtranjeria.validar("E-12345678"));
    }

    @Test
    void testValidarCILocal(){
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        assertFalse(validadorExtranjeria.validar("12345678"));
    }

    @Test
    void testValidarCIExtranjeroInvalido(){
        ValidadorExtranjeriaApplication validadorExtranjeria = new ValidadorExtranjeriaApplication();
        assertFalse(validadorExtranjeria.validar("E-1234567A"));
    }

}
