package resolucao_problemas_estruturados.cauculadora;

import java.util.Scanner;

public class UsarCauculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Digite o primeiro valor(a): ");
            float a = input.nextFloat();

            System.out.println("Digite o segundo valor(b): ");
            float b = input.nextFloat();

            System.out.println("Digite uma opção\n" +
                    "+ --> soma[1]\n" +
                    "- --> subtração[2]\n" +
                    "* --> mutiplicação[3]\n" +
                    "/ --> divisão[4]\n" +
                    "sair[0]\n" +
                    "-----------------");

            int resp = input.nextInt();

            if (resp == 0) {
                break;
            } else if (resp == 1) {
                System.out.println("Resultado: " + a + "+" + b + " = " +  Cauculadora.somar(a, b));
            } else if (resp == 2) {
                System.out.println("Resultado: " + a + "-" + b + " = " +  Cauculadora.subtrair(a, b));
            } else if (resp == 3) {
                System.out.println("Resultado: " + a + "*" + b + " = " +  Cauculadora.mutiplicar(a, b));
            } else if (resp == 4) {
                System.out.println("Resultado: " + a + "/" + b + " = " +  Cauculadora.dividir(a, b));
            }
        }

    }

}

