import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    

    /*Faça um programa que receba a quantidade de vitórias, recebe a quantidade de derrotas, recebe a quantidade de empates. Exibe na tela o nome da equipe (a sua escolha), a quantidade de vitórias, derrotas e empates, e os respectivos percentuais.
    Ex.: 8 vitórias - 53%, 5 derrotas - 33%, 2 empates - 13% */

    Scanner input = new Scanner(System.in);
    String equipe;
    int vitoria, derrota, empate;
    float percvit, percder, percemp, soma;

    System.out.println();
    System.out.print("Digite o nome da sua equipe: ");
    equipe = input.nextLine();
    System.out.println();
    System.out.print("Digite a quantidade de vitórias que você possui: ");
    vitoria = input.nextInt();
    System.out.print("Digite a quantidade de derrotas que você possui: ");
    derrota = input.nextInt();
    System.out.print("Digite a quantidade de empates que você possui: ");
    empate = input.nextInt();
    soma = vitoria + derrota + empate;
    percvit = (vitoria * 100f)/soma;
    percder = (derrota * 100f)/soma;
    percemp = (empate * 100f)/soma;
    System.out.println();
    System.out.println( equipe + " as suas estatisticas são:");
    System.out.print( vitoria + " vitórias - ");
    System.out.printf( "%.1f", percvit);
    System.out.println("%");
    System.out.print( derrota + " derrotas - ");
    System.out.printf( "%.1f", percder);
    System.out.println("%");
    System.out.print( empate + " empates - ");
    System.out.printf( "%.1f", percemp);
    System.out.println("%");
    

    input.close();


    }
}
