package com.locadora;

import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import org.junit.Test;

import com.locadora.Cliente;
import com.locadora.LDELocacao;
import com.locadora.Veiculo;
import com.locadora.locacao;

public class testeLocacao {
   
    @Test
    public void locacaoDataTest() throws ParseException{
        Cliente cliente = new Cliente("João", "12345678910", "999999999", "12345678910");
        Veiculo veiculo = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
   
      
        locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "13/04/2022", 1);
    
        assertEquals("12/04/2022", loc.getDataLocacaoFormatted());
       
        
    }

    @Test
 public void removeLocacaoTest(){
    Cliente c1 = new Cliente("João", "12345678910", "999999999", "12345678910");
    Veiculo v1 = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
    locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "20/04/2022", 1);
    LDELocacao lista = new LDELocacao();
    lista.cadastra(loc);

    lista.remove("ABC-1234");
    assertEquals(0, lista.tamanho());
    

    
    
   }


    @Test
    public void cadastrarValorTest(){
        Cliente c1 = new Cliente("João", "12345678910", "999999999", "12345678910");
        Veiculo v1 = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "19/06/2022", 200);
        LDELocacao lista = new LDELocacao();
        lista.cadastra(loc);


        assertEquals(13600, loc.calcularValorTotal(), 0.01);
        
    }


    @Test
    public void tamanhoTest(){
        Cliente c1 = new Cliente("João", "12345678910", "999999999", "12345678910");
        Veiculo v1 = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "19/06/2022", 200);
        LDELocacao lista = new LDELocacao();
        lista.cadastra(loc);


        assertEquals(1, lista.tamanho());



        
    }



    
}
