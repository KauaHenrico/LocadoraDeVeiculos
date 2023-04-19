package com.locadora;
public class NohVeiculos {
    private Object info; //este exemplo armazena números inteiros
    private NohVeiculos ant; //destaque para o atributo ant de anterior
    private NohVeiculos prox;
    public NohVeiculos (Object info){
    this.info = info;
    this.ant = null;
    this.prox = null;
    }
   
    
    public Object getInfo() { 
        return this.info;
     }
    public NohVeiculos getProx() { 
        return this.prox;
    }
    public void setProx(NohVeiculos n) { this.prox = n; }
    public NohVeiculos getAnt() { 
        return this.ant;
    }
    public void setAnt(NohVeiculos n) { this.ant = n; }



}
