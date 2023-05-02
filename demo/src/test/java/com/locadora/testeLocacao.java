package com.locadora;

import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import org.junit.Test;


public class testeLocacao {
   
    @Test
    public void locacaoDataTest() throws ParseException{
        locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "13/04/2022", 1);
    
        assertEquals("12/04/2022", loc.getDataLocacaoFormatted());
       
        
    }

    @Test
 public void removeLocacaoTest(){
   
    locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "20/04/2022", 1);
    LDELocacao lista = new LDELocacao();
    lista.cadastra(loc);

    lista.remove("ABC-1234");
    assertEquals(0, lista.tamanho());
    

    
    
   }


    @Test
    public void cadastrarValorTest(){
        Veiculo v1 = new Veiculo("ABC-1234", "Fusca", 1990, 1.0f, 4, "Volkswagen", 1010);
        locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "19/06/2022", 200);
        LDELocacao lista = new LDELocacao();
        lista.cadastra(loc);


        assertEquals(13600, loc.calcularValorTotal(), 0.01);
        
    }


    @Test
    public void tamanhoTest(){
       
        locacao loc = new locacao("ABC-1234", "12345678910", "12/04/2022", "19/06/2022", 200);
        LDELocacao lista = new LDELocacao();
        lista.cadastra(loc);


        assertEquals(1, lista.tamanho());




    }



    
}
