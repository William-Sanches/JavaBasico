package aula7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Eqxn eq1 = new Eqxn();
        Delta d1 = new Delta();
        System.out.println("Informe o valor de a: ");
        d1.setA(entrada.nextDouble());
        eq1.setA(d1.getA());
        System.out.println("Informe o valor de b: ");
        d1.setB(entrada.nextDouble());
        eq1.setB(d1.getB());
        System.out.println("Informe o valor de c: ");
        d1.setC(entrada.nextDouble());
        eq1.setC(d1.getC());
        d1.calculaDelta(d1.getA(), d1.getB(), d1.getC());
        eq1.calculaXn(d1.getDelta());
        eq1.calculaXp(d1.getDelta());

/*         System.out.println(eq1.getA()); 00
        System.out.println(eq1.getB()); 00
        System.out.println(eq1.getC()); 00
        System.out.println(d1.getA());
        System.out.println(d1.getB());
        System.out.println(d1.getC()); */


        System.out.println("------------------------");

        if (d1.getA() == 0) {
            System.out.println("Não é equação de segundo grau");
        } else {
            if (d1.getDelta() >= 0) {
                System.out.println("Delta igual a: " + d1.getDelta());
                eq1.calculaXn(d1.getDelta());
                System.out.println("Xn igual a: " + eq1.getXn());
                eq1.calculaXp(d1.getDelta());
                System.out.println("Xp igual a: " + eq1.getXp());
            } else {
                System.out.println("delta negativo, equação sem raízes");
            }
        }
    }
}