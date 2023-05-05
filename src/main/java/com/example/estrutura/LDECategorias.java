package com.example.estrutura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class LDECategorias {
    private NohCategorias inicio;
    private NohCategorias fim;
    private Categorias categoria;
    public LDECategorias (){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Categorias categoria) { //info = 5
        if(categoria instanceof Categorias ){
            NohCategorias novo = new NohCategorias(categoria);
            if (inicio == null){
                inicio = novo;
                fim = novo;
            }else {
                novo.setProx(inicio);
                inicio.setAnt(novo);
                inicio = novo;}
        }else {
            System.out.println("Não é um categoria");}
    }


    public boolean addCategoria(int id, String nome) throws IOException {
        if (categoria == null) {
            categoria = new Categorias(id, nome);
            Map<Integer, String> categorias = categoria.getCategorias();
            if (categorias.containsKey(id)) {
                return false; // categoria com esse ID já existe
            } else {
                categorias.put(id, nome);
                categoria.setCategorias(categorias); // atualiza o mapa de categorias na classe que gerencia os veículos
        
                // escreve a nova categoria no arquivo
                FileWriter writer = new FileWriter("D:\\Documentos\\UNIPAMPA\\EstruturaDeDados\\LocadoraDeVeiculos\\src\\main\\java\\com\\example\\estrutura\\Categorias.csv", true);
                writer.write(id + ";" + nome + "\n");
                writer.close();
        
                return true;
            }
        } else {
            return false; // já existe uma categoria cadastrada
        }
       
    }

    public boolean editarCategoria(int id, String nome) throws IOException {
        Map<Integer, String> categorias = categoria.getCategorias();
        if (categorias.containsKey(id)) {
            categorias.put(id, nome);
            categoria.setCategorias(categorias); // atualiza o mapa de categorias na classe que gerencia os veículos
    
            // atualiza o nome da categoria no arquivo
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Documentos\\UNIPAMPA\\EstruturaDeDados\\LocadoraDeVeiculos\\src\\main\\java\\com\\example\\estrutura\\Categorias.csv"));
            for (Map.Entry<Integer, String> entry : categorias.entrySet()) {
                writer.write(entry.getKey() + ";" + entry.getValue() + "\n");
            }
            writer.close();
    
            return true;
        } else {
            return false; // categoria com esse ID não existe
        }
    }
    public boolean excluiCategoria(int id) throws IOException {
        File arquivo = new File("D:\\Documentos\\UNIPAMPA\\EstruturaDeDados\\LocadoraDeVeiculos\\src\\main\\java\\com\\example\\estrutura\\Categorias.csv");
        File tempFile = new File("D:\\Documentos\\UNIPAMPA\\EstruturaDeDados\\LocadoraDeVeiculos\\src\\main\\java\\com\\example\\estrutura\\temp.csv");
    
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile));
    
        String linha = reader.readLine(); // lê a primeira linha (cabeçalho)
        writer.println(linha); // escreve a primeira linha no arquivo temporário
    
        boolean categoriaEncontrada = false;
    
        while ((linha = reader.readLine()) != null) {
            String[] colunas = linha.split(";");
            int categoriaId = Integer.parseInt(colunas[0]);
    
            if (categoriaId == id) {
                categoriaEncontrada = true;
                continue; // pula a linha com o ID correspondente, não escrevendo no arquivo temporário
            }
    
            writer.println(linha); // escreve a linha no arquivo temporário
        }
    
        reader.close();
        writer.close();
    
        if (categoriaEncontrada) {
            // Substitui o arquivo original pelo arquivo temporário
            arquivo.delete();
            tempFile.renameTo(arquivo);
    
            return true; // retorna true se a categoria foi excluída
        }
    
        return false; // retorna false se a categoria não foi encontrada
    }
    


    public boolean buscaCategoria(int id) throws IOException {
        Map<Integer, String> categorias = categoria.getCategorias();
        if (categorias.containsKey(id)) {
            return true;
        } else {
            return false;
        }
    }


}
