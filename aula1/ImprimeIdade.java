package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 28;
        String nome = "Victor Icoma";
        double altura = 1.88;
        double peso = 132.56;

        double imc = (peso) / (altura * altura);

        System.out.println("Olá:  "+ nome);
        if (idade >= 40) {
            if (imc < 22) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " risco de subnutrição.");
            } else if (imc <= 30) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " isso aí garoto(a)");
            } else if (imc <= 35) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " opa, pode estar pesado. Cuidado.");
            } else {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " procure um nutricionista.");
            }
        } else {
            if (imc <= 18) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " Procure um médico para avaliação de subnutrição.");
            } else if (imc <= 26) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " Seu índice está controlado e saudável.");
            } else if (imc <= 32) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " Parabéns, consulte um médico para medição muscular.");
            } else if (imc <= 40) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " Pré-obesidade, precisará de acompanhamento nutricional.");
            } else if (imc >= 41) {
                System.out.println("IMC: " + imc + "sua idade é " + idade + " Procure um médico endocrinologista com urgência.");
            }

        }

    }
}