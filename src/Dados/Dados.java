package Dados;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        System.out.println("Digite seu sexo");
        String sexo = teclado.next();
        System.out.println("Idade digitada foi: " +  idade);
        System.out.println("Nome digitada foi: " +  nome);
        System.out.println("Sexo digitada foi: " +  sexo);




    }
}
