package AvaliacaoJava_01.Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Classe obj = new Classe();
        Scanner sc = new Scanner(System.in);
        int Receber = 0;

        System.out.println("========================");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");
        System.out.println("3 - Exercício 3");
        Receber = sc.nextInt();

        switch (Receber) {
            case 1: {
                obj.Metodo01();
                break;
            }
            case 2: {
                obj.Metodo02();
                break;
            }
            case 3: {
                obj.Metodo03();
                break;
            }
            default: {

                System.out.println("Escolha uma dessas opções!");
                break;
            }
        }
    }
}
