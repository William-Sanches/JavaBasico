package aula3;

import java.util.Random;

public class Vetores {
    public static void main(String[] args) {
        Random a = new Random();

        double[] valores = {
                a.nextInt(30),
                a.nextInt(70),
                a.nextInt(90),
                a.nextInt(120),
                a.nextInt(150),
                a.nextInt(180),
                a.nextInt(240)
        };

        double[] comparadores = {
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10),
                a.nextInt(10)
        };

        for (int i = 0; i < valores.length; i++) {
            if (valores.length == comparadores.length) {
                System.out.println("valores[" + i + "] = " + valores[i]);
                System.out.println("comparadores[" + i + "] = " + comparadores[i]);
                if (valores[i] % comparadores[i] == 0) {
                    System.out.println("---------------");
                    System.out.println(valores[i] + " é multiplo de " + comparadores[i]);
                }
            } else {
                System.out.println("Os vetores não são do mesmo tamanho.");
            }
        }
    }
}