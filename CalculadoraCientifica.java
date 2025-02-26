package calculadora;

import java.util.Scanner;

public class CalculadoraCientifica {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando uma instância da Calculadora
        Calculadora calculadora = new Calculadora();
        
        // Menu de opções
        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Seno");
        System.out.println("6. Cosseno");
        System.out.println("7. Logaritmo");
        System.out.println("8. Fatorial");
        System.out.println("9. Sair");
        
        int escolha = scanner.nextInt();
        
        // Variáveis para armazenar os números
        double num1, num2;

        if (escolha == 1) { // Soma
            System.out.println("Digite dois números:");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Resultado: " + calculadora.soma(num1, num2));
        } else if (escolha == 2) { // Subtração
            System.out.println("Digite dois números:");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Resultado: " + calculadora.subtracao(num1, num2));
        } else if (escolha == 3) { // Multiplicação
            System.out.println("Digite dois números:");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Resultado: " + calculadora.multiplicacao(num1, num2));
        } else if (escolha == 4) { // Divisão
            System.out.println("Digite dois números:");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            if (num2 != 0) {
                System.out.println("Resultado: " + calculadora.divisao(num1, num2));
            } else {
                System.out.println("Erro: Divisão por zero.");
            }
        } else if (escolha == 5) { // Seno
            System.out.println("Digite um número (em radianos):");
            num1 = scanner.nextDouble();
            System.out.println("Resultado: " + calculadora.seno(num1));
        } else if (escolha == 6) { // Cosseno
            System.out.println("Digite um número (em radianos):");
            num1 = scanner.nextDouble();
            System.out.println("Resultado: " + calculadora.cosseno(num1));
        } else if (escolha == 7) { // Logaritmo
            System.out.println("Digite um número:");
            num1 = scanner.nextDouble();
            if (num1 > 0) {
                System.out.println("Resultado: " + calculadora.logaritmo(num1));
            } else {
                System.out.println("Erro: Logaritmo de número não positivo.");
            }
        } else if (escolha == 8) { // Fatorial
            System.out.println("Digite um número:");
            num1 = scanner.nextDouble();
            if (num1 >= 0 && num1 == (int) num1) {
                System.out.println("Resultado: " + calculadora.fatorial((int) num1));
            } else {
                System.out.println("Erro: Fatorial só pode ser calculado para números inteiros não negativos.");
            }
        } else if (escolha == 9) { // Sair
            System.out.println("Saindo...");
        } else { // Caso a opção seja inválida
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

// Classe Calculadora que realiza as operações
class Calculadora {

    // Funções para operações básicas
    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }

    // Funções científicas
    public double seno(double a) {
        return Math.sin(a);
    }

    public double cosseno(double a) {
        return Math.cos(a);
    }

    public double logaritmo(double a) {
        return Math.log(a);
    }

    // Função para calcular o fatorial
    public long fatorial(int n) {
        if (n == 0) return 1;
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
