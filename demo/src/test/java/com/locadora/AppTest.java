package com.locadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void tamanhoVeiculos(){
        Veiculo v1 = new Veiculo("Fusca", 1);
        Veiculo v2 = new Veiculo("Gol", 2);
        Veiculo v3 = new Veiculo("Celta", 3);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
        lde.insereInicio(v2);
        lde.insereInicio(v3);
        assertTrue(lde.tamanho() == 3);
    }


    @Test
    public void removeVeiculo(){
        Veiculo v1 = new Veiculo("Fusca", 1);
        Veiculo v2 = new Veiculo("Gol", 2);
        Veiculo v3 = new Veiculo("Celta", 3);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
        lde.insereInicio(v2);
        lde.insereInicio(v3);
        lde.remove(2);
        assertEquals(lde.tamanho(), 2);
    }

    @Test
    public void insereVeiculo(){
        Veiculo v1 = new Veiculo("Fusca", 1);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
        if(lde.busca("Fusca") == true){
            assertTrue(true);
        } else {
            assertTrue(false);
        }

    }

    @Test
    public void removeNegativo(){
        Veiculo v1 = new Veiculo("Fusca", 1);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
        if(lde.remove(-1) == false){
            assertTrue(true);
        } else {
            assertTrue(false);
        }

    }


    @Test(expected = IllegalArgumentException.class)
    public void insereNegativo(){
        Veiculo v1 = new Veiculo("Fusca", -1);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insereVazio(){
        Veiculo v1 = new Veiculo("", 1);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
      

    }

    @Test(expected = IllegalArgumentException.class)
    public void removeVazio(){
        Veiculo v1 = new Veiculo("", 1);
        LDEVeiculos lde = new LDEVeiculos();


        
    }


    @Test(expected = IllegalArgumentException.class)
    public void buscaVazio(){
        Veiculo v1 = new Veiculo("Fusca", 1);
        LDEVeiculos lde = new LDEVeiculos();
        lde.insereInicio(v1);
        lde.busca("");

    }

    
        

  

}
