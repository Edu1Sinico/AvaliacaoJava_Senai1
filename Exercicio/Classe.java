package AvaliacaoJava_01.Exercicio;

import java.util.Scanner;

public class Classe {
    Scanner sc = new Scanner(System.in);
    
    public void Metodo01() {
        System.out.println("Escolha uma das operações:");   
        System.out.println("1 - Adição;");
        System.out.println("2 - Subtração;");
        System.out.println("3 - Multiplicação;");
        System.out.println("4 - Divisão.");
        int x = sc.nextInt();

        switch (x) {
            case 1:{
                System.out.println("Operação de Adição");
                System.out.println("Digite o primeiro número:");
                Double valor1 = sc.nextDouble();
                System.out.println("Agora digite o segundo número:");
                Double valor2 = sc.nextDouble();
                Double total = valor1 + valor2;
                System.out.println("O Resultado da adição será: " + total);
                break;
            }

            case 2:{
                System.out.println("Operação de Subtração");
                System.out.println("Digite o primeiro número:");
                Double valor1 = sc.nextDouble();
                System.out.println("Agora digite o segundo número:");
                Double valor2 = sc.nextDouble();
                Double total = valor1 - valor2;
                System.out.println("O Resultado da subtração será: " + total);
                break;
            }

            case 3:{
                System.out.println("Operação de Multiplicação");
                System.out.println("Digite o primeiro número:");
                Double valor1 = sc.nextDouble();
                System.out.println("Agora digite o segundo número:");
                Double valor2 = sc.nextDouble();
                Double total = valor1 * valor2;
                System.out.println("O Resultado da multiplicação será: " + total);
                break;
            }

            case 4:{
                System.out.println("Operação de Divisão");
                System.out.println("Digite o primeiro número para o numerador:");
                Double valor1 = sc.nextDouble();
                System.out.println("Agora digite o segundo número para o denominador:");
                Double valor2 = sc.nextDouble();
                if(valor2 != 0)
                {
                Double total = valor1 / valor2;
                System.out.println("O Resultado da divisão será: " + total);
                }
                else{
                    System.out.println("Não existe divisão por 0!");
                }
                break;
            }
            default:
            {
                System.out.println("Escolha uma das opções anteriores.");
                break;
            }
        }
    }

    public void Metodo02() {
        System.out.println("Digite o nº da sua matricula:");
        int numMatr = sc.nextInt();
        int resultado = numMatr % 4;
        if(resultado == 0)
        {
            System.out.println("Você é do time do Chris.");
        }
        else if (resultado == 1)
        {
            System.out.println("Você é do time do Greg.");
        }
        else if (resultado == 2)
        {
            System.out.println("Você é do time do Caruso.");
        }
        else if (resultado == 3)
        {
            System.out.println("Você é do time do Jerome.");
        }
    }

    public void Metodo03() {
        System.out.println("Digite quantos Kg de morangos que você pegou:");
        double valor1 = sc.nextDouble();
        double precoMorango = valor1*3.50;
        System.out.println("Digite quantos Kg de maçãs que você pegou:");
        double valor2 = sc.nextDouble();
        double precoMaca = valor2*2.30;
        System.out.println("Digite quantos Kg de bananas que você pegou:");
        double valor3 = sc.nextDouble();
        double precoBanana = valor3*1.80;

        double totalPreco = precoMorango + precoMaca + precoBanana;
        double totalQuilo = valor1 + valor2 + valor3;

        if(totalQuilo > 15 || totalPreco > 30)
        {
            double total = totalPreco - totalPreco*0.1;
            System.out.println("O valor foi descontado 10%: " + total);
        }
    }
}
