package br.com.dio.exercicios;

public class Exercicio_3 {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;


        System.out.println(" b1&&b2 " + (b1&&b2));
        System.out.println(" b1&&b3 " + (b1&&b3));

        System.out.println(" b2||b3 " + (b2||b3));
        System.out.println(" b2||b4 " + (b2||b4));

        System.out.println(" b1 ^ b3 " + (b1 ^ b3));
        System.out.println(" b4 ^ b1 " + (b4 ^ b1));

        double salarioMensal = 12323.25d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal<mediaSalario)&&(quantidadeDependentes >=mediaDependentes));


    }
}
