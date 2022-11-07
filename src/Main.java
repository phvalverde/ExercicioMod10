import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Olá, vamos descobrir a sua média? ");
        String resposta = s.next();

        if (resposta.equalsIgnoreCase("Sim")) {

            System.out.println("Nota do primeiro bimestre: ");
            double bi1 = s.nextDouble();

            System.out.println("Nota do segundo bimestre: ");
            double bi2 = s.nextDouble();

            System.out.println("Nota do terceiro bimestre: ");
            double bi3 = s.nextDouble();

            System.out.println("Nota do quarto bimestre: ");
            double bi4 = s.nextDouble();

            double mediaAluno = (bi1 + bi2 + bi3 + bi4) / 4;
            System.out.printf("A média do aluno foi: %.2f %n", +mediaAluno);

            if (mediaAluno >= 7) {
                System.out.println("Está aprovado. ");
            } else if (mediaAluno < 6) {
                System.out.println("Está reprovado. ");
            } else {
                System.out.println("Está na Recuperação. ");
            }

        } else {
            System.out.println("Outra hora então. ");
        }
    }
}