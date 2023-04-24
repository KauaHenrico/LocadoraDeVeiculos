package com.locadora;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*  Autores: Kauã Henrico da Silva Souza, Guilherme de Avila de Moura, Andre Luiz Mendes Miranda
 */
public class App 
{
    public static void main( String[] args )
    {
       LDEVeiculos listaV = new LDEVeiculos();
     
      
                try {
                    File file = new File("D:\\Documentos\\UNIPAMPA\\EstruturaDeDados\\LocadoraDeVeiculos\\demo\\src\\main\\java\\com\\locadora\\Veiculos.csv");
                    Scanner scanner = new Scanner(file);
        
                    // Ignora a primeira linha, que contém apenas os nomes das colunas
                    scanner.nextLine();
        
                    while (scanner.hasNextLine()) {
                        String linha = scanner.nextLine();
                        String[] colunas = linha.split(";");
        
                        String placa = colunas[0];
                        String modelo = colunas[1];
                        String marca = colunas[2];
                        int ano = Integer.parseInt(colunas[3]);
                        float potencia = Float.parseFloat(colunas[4]);
                        int lugares = Integer.parseInt(colunas[5]);
                        int idCategoria = Integer.parseInt(colunas[6]);
                        Veiculo veiculo = new Veiculo(placa, modelo, ano, potencia, lugares, marca, idCategoria);
                        veiculo.setCategoria(idCategoria);

                        listaV.insereInicio(veiculo);
                      
                      
                        // Adiciona o veículo em algum lugar, como uma lista
                    }
        
                    scanner.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


                listaV.busca("IVY-5357");

                


            }

        

            
        }

        
    