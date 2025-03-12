package Testes.Calculadora;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("======== Aplicando Soma ========");

        Calculadora numeros = new Calculadora();
        Scanner input = new Scanner(System.in);
        int resultado;

        System.out.println("Escreva o Primeiro número: ");
        numeros.primeiro = input.nextInt();
        System.out.println("Escreva o Segundo número: ");
        numeros.segundo = input.nextInt();

        resultado = numeros.Soma(numeros.primeiro, numeros.segundo);
        System.out.println("A soma dos produtos é: " + resultado);







        input.close();
    }

}
