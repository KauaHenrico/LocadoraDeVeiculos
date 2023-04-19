package com.locadora;

/*  Autores: Kauã Henrico da Silva Souza, Guilherme de Avila de Moura, Andre Luiz Mendes Miranda
 */
public class App 
{
    public static void main( String[] args )
    {
        Reader reader = new Reader();
        
        String caminhoArquivo = "caminho/do/arquivo.csv";
        String[][] dados = reader.lerArquivoCSV(caminhoArquivo);
        
        // Exemplo de impressão dos dados lidos do arquivo CSV
        for (String[] linha : dados) {
            for (String coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();}
    }
}
