package br.com.dio.exercicios;

public class Curso {

    public static void main(String[] args) {

        System.out.println("prePos");
        prePos();


    }

        private static void prePos(){
            int k = 10;
            int i = ++k;
            int j = k--;
            int x = k;

            System.out.println("i : "+ i);
            System.out.println("j : "+ j);
            System.out.println("x : "+ x);
        }

}
