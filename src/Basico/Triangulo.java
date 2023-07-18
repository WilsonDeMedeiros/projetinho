package Basico;

import java.util.Scanner;

public class Triangulo {
    

    public static void main (String[] args){
        System.out.println("digite o tamanho do lado A do triangulo");

        Scanner input = new Scanner(System.in);
        double ladoA = input.nextDouble();

        System.out.println("digite o tamanho do lado B do triangulo");
        double ladoB = input.nextDouble();

        System.out.println("digite o tamanho do lado C do triangulo");
        double ladoC = input.nextDouble();

        input.close();

        if (ladoA == ladoB && ladoA == ladoC){
            System.out.println ("Triangulo Equilátero!");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            System.out.println ("Triangulo Isóceles!");
        } else {
            System.out.println("Triangulo Escaleno!");
        }

    }
    
}
