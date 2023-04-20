package com.locadora;

/*  Autores: Kauã Henrico da Silva Souza, Guilherme de Avila de Moura, Andre Luiz Mendes Miranda
 */
public class App 
{
    public static void main( String[] args )
    {
        Veiculo v1 = new Veiculo("Fusca", 1);
        Veiculo v2 = new Veiculo("Gol", 2);
        Veiculo v3 = new Veiculo("Celta", 3);
        Veiculo v4 = new Veiculo("Palio", 4);
        v1.setPlaca("ABC-1234");
        v1.setModelo("Fusca");
        v1.setAno(1990);
        v1.setPotencia(1.0f);
        v1.setLugares(4);
        v1.setMarca("Volkswagen");


        Lista lde = new LDEVeiculos();
        lde.insereInicio(v1);
        lde.insereInicio(v2);
        lde.insereInicio(v3);
        lde.insereInicio(v4);


        lde.imprime();

        System.out.println("Tamanho: " + lde.tamanho());

        lde.remove(2);

        
        System.out.println("Tamanho: " + lde.tamanho());
        lde.imprime();




        
    }
}
