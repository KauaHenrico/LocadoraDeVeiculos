package org.example;

public class PlanoCartesiano {
    private float x1, x2, y1, y2;

    public PlanoCartesiano(float x1, float x2, float y1, float y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    //método get x1
    public float getX1(){
        return x1;
    }
    //método get x2
    public float getX2(){
        return x2;
    }
    //método get y1
    public float getY1(){
        return y1;
    }
    //método get y2
    public float getY2(){
        return y2;
    }
    //calcula distancia euclidiana entre dois pontos
    public double calculaDistanciaCart(){
        double dist = 0;
        float cateto1 = x2 - x1;
        float cateto2 = y2 - y1;
        double potencia1 = Math.pow(cateto1,2);
        double potencia2 = Math.pow(cateto2,2);
        dist = Math.sqrt(potencia1+potencia2);
        return dist;
    }
}
