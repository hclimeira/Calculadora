/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.metodista.ads5.projeto;

/**
 *
 * @author 235465
 */
import java.util.Scanner;

/**
 *
 * @author 235465
 */
public class Calculadora {

    /*Declaração dos métodos*/
    public int som(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public int mult(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Calculadora c = new Calculadora();
        //declarando as varíaveis
        int opcao = 5;
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");
        System.out.println("1. Soma");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.println("0. Sair");
        System.out.println("Operação: ");
        opcao = input.nextInt();
        while (opcao != 0) {
            if (opcao == 1) {
                ///???????
                /**
                 * Que outra maneira poderia ser recebido os numeros, sem que se
                 * repita as próximas linhas para todas operações*
                 */
                Scanner input1 = new Scanner(System.in);

                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                //System.out.println("Resultado: ");
                int operacao = c.som(num1, num2);
                System.out.println("Resultado: " + operacao);
                break;
            }

            if (opcao == 2) {
                Scanner input1 = new Scanner(System.in);
                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.sub(num1, num2);
                System.out.println(operacao);
                break;
            }
            if (opcao == 3) {
                Scanner input1 = new Scanner(System.in);
                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.mult(num1, num2);
                System.out.println(operacao);
                break;
            }
            if (opcao == 4) {
                Scanner input1 = new Scanner(System.in);
                System.out.println("Qual o primeiro numero: ");
                num1 = input1.nextInt();
                System.out.println("Qual o segundo numero: ");
                num2 = input1.nextInt();
                int operacao = c.div(num1, num2);
                System.out.println(operacao);
                break;
            } else {
                System.out.println("????");
                break;
            }
        }
    }
}

