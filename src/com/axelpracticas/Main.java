package com.axelpracticas;

import java.util.Scanner;

import static com.axelpracticas.Conversion.Convertir;

public class Main {
    public static void main(String[] args) {

// Menú de salida, donde mientras no se elija la opcion 7, el bucle seguirá

        SUCESS:
        while (true){
            System.out.println("Conversor de monedas");
            System.out.println("****************************************");
            System.out.println(
                    "1. Dolares => pesos dominicanos\n" +
                    "2. Pesos dominicanos => dolares\n" +
                    "3. Euros => pesos dominicanos\n" +
                    "4. pesos dominicanos => euros\n" +
                    "5. Soles peruanos => pesos dominicnaos\n" +
                    "6. Pesos dominicanos => soles peruanos\n" +
                    "7. Salir");
            System.out.println("****************************************");

            System.out.println("Ingrese una opcion");
            Scanner lectura = new Scanner(System.in);
            char opcion = lectura.next().charAt(0);

//Multicondicion para las distintas opciones:

            switch (opcion){
                case '1':
                      Convertir(58.89,  "pesos dominicanos");
                      break;

                case '2':
                    Convertir(0.017, "Dolares estadounidenbses");
                    break;

                case '3':
                    Convertir(63.92, "pesos dominicanos");
                    break;

                case '4':
                    Convertir(0.016, "Euros");
                    break;

                case '5':
                    Convertir(15.74, "pesos dominicanos");
                    break;

                case '6':
                    Convertir(0.064, "Soles peruanos");
                    break;

                case '7':
                    System.out.println("Cerrando programa");
                    break SUCESS;

                default:
                    System.out.println("Opcion Incorrecta");
                 break;

            }
        }

    }

}
