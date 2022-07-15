package com.mycompany.p2a_clase1;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        int op = 0;
        while (op != 7) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("***MENU PRINCIPAL***");
            System.out.println("1. Arreglos");
            System.out.println("2. While");
            System.out.println("3. Do-While");
            System.out.println("4. For");
            System.out.println("5. Funcion que retorna informacion");
            System.out.println("6. If en pares");
            System.out.println("7. Salir");
            System.out.println("Elige una de estas opciones.");
            op = entrada.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println("Suma de 3 numeros en un arreglo:");
                    int[] numeros = new int[3];
                    sumaNumeros(numeros);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Mostramos numeros mientras no sea un maximo:");
                    NumsHastaMax(1);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Suma mientras no se llegue a un numero:");
                    SumaHastaX(1);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Tabla de multipliar de un numero:");
                    TablaMultiplicar(4);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Mayor o menor de edad:");
                    Mayor_MenordeEdad(19);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Numeros pares3:");
                    NumerosPares();
                    System.out.println("");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("La opcion elegida no es valida.");
                    System.out.println("");
            }
        }
    }

    public static void NumerosPares() {
        Scanner entrada = new Scanner(System.in);
        int num, s, t;
        num = s = t = 0;
        System.out.println("Ingrese el numero de inicio para los pares:");
        s = entrada.nextInt();
        System.out.println("Ingrese el numero de finalizacion para los pares:");
        t = entrada.nextInt();
        for (int i = s; i <= t; i++) {
            if (i % 2 == 0) {
                num++;
            }
        }
        System.out.println("Del " + s + " al " + t + " hay: " + num + " Numeros pares.");
    }

    public static void Mayor_MenordeEdad(int edad) {
        String x = "";
        if (edad < 18) {
            x = "menor";
        } else if (edad >= 18) {
            x = "mayor";
        }
        System.out.println("Eres " + x + " de edad");
    }

    public static void TablaMultiplicar(int x) {
        int r;
        for (int i = 1; i <= 10; i++) {
            r = x * i;
            System.out.println(x + " X " + i + " = " + r);
        }
    }

    public static void SumaHastaX(int i) {
        int x = 1;
        i = 1;
        int r;
        do {
            r = i + x;
            x++;
            System.out.println(r);
        } while (r <= 8);
    }

    public static void NumsHastaMax(int i) {
        int max = 15;
        i = 1;
        while (i <= max) {
            System.out.println(i);
            i++;
        }
    }

    public static void sumaNumeros(int[] naturales) {
        int result;
        naturales[0] = 2;
        naturales[1] = 4;
        naturales[2] = 5;
        result = naturales[0] + naturales[1] + naturales[2];
        System.out.println(result);
    }
}
