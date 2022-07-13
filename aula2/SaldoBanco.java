package aula2;

import java.util.Random;

public class SaldoBanco {
    public static void main(String[] args) {
        /*
         * Monte um sistema de repetição:
         * A partir de um saldo ele tenha uma variável ou técnica que identifique se a
         * movimentação creditou ou debitou.
         * Ao final ele mostra 12 movimentos e como ficou o saldo final.
         */
        Random randomico = new Random();

        int saldo = 2000;
        double i = 0;
        int q = 0;
        int n;
        int fator = 0;

        while (q < 12) {
            for (n = 1; n <= 12; n++) {
                fator = randomico.nextInt(2);
                if (fator == 0) {
                    i = randomico.nextInt(500) * (-1);
                    System.out.println("--------------------------------------------");
                    saldo += i;
                    System.out.println("Débito de: " + i + "." + " Saldo atual é: " + saldo + ".");
                    q++;
                } else {
                    i = randomico.nextInt(500);
                    System.out.println("--------------------------------------------");
                    saldo += i;
                    System.out.println("Crédito de: " + i + "." + " Saldo atual é: " + saldo + ".");
                    q++;
                }
                n++;
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Saldo atual é: " + saldo + ".");
    }
}
