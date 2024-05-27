package com.axelpracticas;

import java.util.Scanner;

public class Conversion {

    //   Algoritmo para la concersion de divisas

    public static void Convertir(double DiferentesMonedas, String país){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", país);
        double CantidadDeMoneda = scanner.nextDouble();


        double moneda = DiferentesMonedas * CantidadDeMoneda;


        moneda = (double) Math.round(moneda * 100d)/100;

        System.out.println("-----------------------------------");

        System.out.println("Tienes " + moneda + país);

        System.out.println("-----------------------------------");

    }

}
