package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        float x1, x2, y1, y2;
        System.out.println("Informe o ponto x do primeiro ponto: ");
        x1 = e.nextFloat();
        System.out.println("Informe o ponto y do primeiro ponto: ");
        y1 = e.nextFloat();
        System.out.println("Informe o ponto x do segundo ponto: ");
        x2 = e.nextFloat();
        System.out.println("Informe o ponto y do segundo ponto: ");
        y2 = e.nextFloat();
        PlanoCartesiano planoCartesiano = new PlanoCartesiano(x1,x2,y1,y2);
        System.out.println(planoCartesiano.calculaDistanciaCart());
    }
}