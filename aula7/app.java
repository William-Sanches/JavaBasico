package aula7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Eqxn eq1 = new Eqxn();
        System.out.println("Informe o valor de a: ");
        eq1.setA(entrada.nextDouble());
        System.out.println("Informe o valor de b: ");
        eq1.setB(entrada.nextDouble());
        System.out.println("Informe o valor de c: ");
        eq1.setC(entrada.nextDouble());

        System.out.println("------------------------");

        if (eq1.calculaDelta(eq1.getA(), eq1.getB(), eq1.getC()) >= 0){
            System.out.println("Delta igual a: " + eq1.getDelta());
            eq1.calculaXn(eq1.getDelta(), eq1.getA(), eq1.getB());
            System.out.println("Xn igual a: "+eq1.getXn());
            eq1.calculaXp(eq1.getDelta(), eq1.getA(), eq1.getB());
            System.out.println("Xp igual a: "+eq1.getXp());
        } else {
            System.out.println("delta negativo, equação sem raízes");
        }
    }
}