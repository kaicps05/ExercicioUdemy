package org.example;
import java.util.Scanner;

public class Main {

   static void main() {

       System.out.println("Digite um numero referente ao dia da semana :");
       System.out.println("Domingo = 1");
       System.out.println("Segunda = 2");
       System.out.println("Terça = 3");
       System.out.println("Quarta = 4");
       System.out.println("Quinta = 5");
       System.out.println("Sexta = 6");
       System.out.println("Sabado = 7");

       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();

       String dia = switch (x) {
           case 1 -> "Domingo";
           case 2 -> "Segunda";
           case 3 -> "Terça";
           case 4 -> "Quarta";
           case 5 -> "Quinta";
           case 6 -> "Sexta";
           case 7 -> "Sabado";
           default -> "Valor invalido";
       };

       System.out.println("O dia selecionado é  : " + dia);
    }
}
