package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite um valor :");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor :");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("somar : " + somar);
        System.out.println("sub : " + subtrair);
        System.out.println("multi : " + multiplicar);
        System.out.println("dividi : " + dividir);




    }
    public static int somar (int a, int b){
        return a+b;
    }
    public static int subtrair (int a, int b){
        return a-b;
    }
    public static int multiplicar (int a, int b){
        return a*b;
    }
    public static float dividir (float a, float b){
        return a/b;
    }



}
