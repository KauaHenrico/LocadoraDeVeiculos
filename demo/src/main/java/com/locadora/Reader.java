package com.locadora;

import java.io.File;
import java.util.Scanner;

public class Reader {

   
        
    
    
    public  String[][] lerArquivoCSV(String caminhoArquivo) {
        int numLinhas = contarLinhasArquivo(caminhoArquivo);
        String[][] dados = new String[numLinhas][];
        
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            int linha = 0;
            while (scanner.hasNextLine()) {
                String linhaAtual = scanner.nextLine();
                String[] colunas = linhaAtual.split(",");
                dados[linha] = colunas;
                linha++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dados;
    }
    
    public static int contarLinhasArquivo(String caminhoArquivo) {
        int numLinhas = 0;
        
        try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numLinhas++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return numLinhas;
    }
}
