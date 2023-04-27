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
       LDEClientes listaC = new LDEClientes();
       LDELocacao listaL = new LDELocacao();
   
                try {
                    File file = new File("C:\\Users\\André\\OneDrive\\Documentos\\Unipampa\\EstruturaDeDados\\LocadoraDeVeiculos\\demo\\src\\main\\java\\com\\locadora\\Veiculos.csv");
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
                        Cliente cliente = new Cliente("Andre", "12345678910", "Rua 1", "123456789");
                        listaC.insereInicio(cliente);
                        locacao locacao = new locacao(veiculo, cliente, "01/01/2021", "10/01/2021", 100.00f);
                        listaL.cadastra(locacao);

                    }
        
                    scanner.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                
                    
            

                
             
               
                listaL.locarVeiculo("IVI-5T72", "12345678910");
             
                
                
            

               


            }

          

            

            
        }

        
    