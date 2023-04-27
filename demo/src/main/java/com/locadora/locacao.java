package com.locadora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class locacao {
   private int codLocacao;
   private String veiculo;
   private  String cliente;
  private  Date dataLocacao;
   private Date dataDevolucao;
   private float valorLocacao;
   private static int contador = 1;
    

   public locacao ( Veiculo veiculo, Cliente  cliente, String dataLocacao, String dataDevolucao, float valorLocacao){

    this.codLocacao = contador++;
      this.veiculo = veiculo.getPlaca();
      this.cliente = cliente.getCpf();
      
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      try {
         this.dataLocacao = sdf.parse(dataLocacao);
         this.dataDevolucao = sdf.parse(dataDevolucao);
      } catch (ParseException e) {
         throw new IllegalArgumentException("Formato de data inválido");
      }

      if (this.dataLocacao.after(this.dataDevolucao)) {
         throw new IllegalArgumentException("A data de locação não pode ser maior que a data de devolução");
      }
      
      if (this.dataDevolucao.before(this.dataLocacao)) {
         throw new IllegalArgumentException("A data de devolução não pode ser menor que a data de locação");
      }
      
      if (valorLocacao < 0) {
         throw new IllegalArgumentException("O valor da locação não pode ser negativo");
      } else {
         this.valorLocacao = valorLocacao;
      }
   }







    public int getCodLocacao() {
    return codLocacao;
}


public void setCodLocacao(int codLocacao) {
    this.codLocacao = codLocacao;
}


public String getVeiculo() {
    return veiculo;
}


public void setVeiculo(String veiculo) {
    this.veiculo = veiculo;
}


public String getCliente() {
    return cliente;
}


public void setCliente(String cliente) {
    this.cliente = cliente;
}


public Date getDataLocacao() {
    return dataLocacao;
}


public void setDataLocacao(Date dataLocacao) {
    this.dataLocacao = dataLocacao;
}


public Date getDataDevolucao() {
    return dataDevolucao;
}


public void setDataDevolucao(Date dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
}


public float getValorLocacao() {
    return valorLocacao;
}


public void setValorLocacao(float valorLocacao) {
    this.valorLocacao = valorLocacao;
}

public String getDataLocacaoFormatted() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return sdf.format(dataLocacao);
 }
 

    
}
