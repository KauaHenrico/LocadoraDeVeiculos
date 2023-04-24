package com.locadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void categoriaCertaTest(){
        // Veiculo veiculo = new Veiculo(placa, modelo, ano, potencia, lugares, marca, idCategoria);
        Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        assertEquals(1010, veiculo.getIdCategoria());
    }


    @Test
    public void categoriaErradaTest(){
        // Veiculo veiculo = new Veiculo(placa, modelo, ano, potencia, lugares, marca, idCategoria);
        Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        assertNotEquals(1011, veiculo.getIdCategoria());
    }

    @Test
    public void  buscaVeiculoTest(){
    LDEVeiculos lista = new LDEVeiculos();
        Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        lista.insereInicio(veiculo);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       System.setOut(new PrintStream(outContent));

       lista.busca("ABC-1234");
       String output = outContent.toString();
       assertTrue(output.contains("esportivo"));

    
        

    }


    @Test (expected = IllegalArgumentException.class)
    public void buscaVazio(){
        LDEVeiculos lista = new LDEVeiculos();
        Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        lista.insereInicio(veiculo);
        lista.busca("ABC-1234");
        lista.busca("");
        
    }

            @Test
            public void  removeVeiculoTest(){
                LDEVeiculos lista = new LDEVeiculos();
                Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
                Veiculo veiculo2 = new Veiculo("ABC-1235", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1012);
                lista.insereInicio(veiculo);
                lista.insereInicio(veiculo2);
                lista.remove("ABC-1234");

                assertFalse(lista.existeVeiculo("ABC-1234"));

                assertEquals(1, lista.tamanho());
                


            }
}
