package Senai_LLP_IfElse_IMC;

import java.util.Scanner;
/*
Implemente uma aplicação que calcula o índice de Massa Corporal (IMC)
    a. Recebe a altura
    b. Recebe o peso
    c. Retorna o índice e a intepretação:
        1. Abaixo do peso: IMC menor que 18,5
        2. Peso normal: IMC entre 18,5 e 24,9
        3. Sobrepeso: IMC entre 25 e 25,9
        4. Obesidade: IMC igual ou superior a 30
*/
public class IMC {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double Peso, Altura, IMC;

        // Leitura de informações:
        System.out.println("Digite o peso: ");
        Peso = leia.nextDouble();
        System.out.println("Digite a altura: ");
        Altura = leia.nextDouble();
        
        // Calculo
        IMC = Peso/(Math.pow(Altura, 2));

        if (IMC < 18.5) {
            System.out.println("Indíce: " + IMC + "\n" + "Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <=24.9) {
                System.out.println("Indíce: " + IMC + "\n" + "Peso normal");
        } else if (IMC >= 25 && IMC <= 25.9) {
            System.out.println("Indíce: " + IMC + "\n" + "Sobrepeso");
        } else {
            System.out.println("Indíce: " + IMC + "\n" + "Obesidade");
        }
    }
}