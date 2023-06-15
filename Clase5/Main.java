package Clase5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        //PESO EN KG / ALTURA EN METROS AL CUADRADO
        System.out.print("INGRESA  TU PESO EN KG POR FAVOR: ");
        double peso = datos.nextDouble();
        System.out.print("INGRESA TU ALTURA EN METROS: ");
        double tall = datos.nextDouble();

        double indiceMasaCorporal = peso / (tall * tall);
        System.out.println("su indice de masa corporal es: "+ indiceMasaCorporal);

        if (indiceMasaCorporal>30){
            System.out.println("OBESIDAD");
        } else if(indiceMasaCorporal>=25 && indiceMasaCorporal<=30){
            System.out.println("SOBREPESO");
        } else if (indiceMasaCorporal>=18.5 && indiceMasaCorporal<25) {
            System.out.println("NORMAL");
        } else if (indiceMasaCorporal<18.6) {
            System.out.println("TU PESO ES MUY MENOR ALIMENTARSE MIERDA");
        }

    }






}
