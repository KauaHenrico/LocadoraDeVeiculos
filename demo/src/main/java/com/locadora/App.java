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

        Lista lde = new LDE();
        lde.insereInicio(v1);
        lde.insereInicio(v2);
        lde.insereInicio(v3);
        lde.insereInicio(v4);


        lde.imprime();

        System.out.println("Tamanho: " + lde.tamanho());

        lde.remove(v2);

        
        System.out.println("Tamanho: " + lde.tamanho());
        lde.imprime();
    }
}
