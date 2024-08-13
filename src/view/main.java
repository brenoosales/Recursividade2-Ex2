package view;

import controller.Ex2;

public class main {
    public static void main(String[] args) {
        int dividendo = 26, divisor = 9, resto;

        resto = Ex2.restoDivisao(dividendo, divisor);
        System.out.printf("O resto da divisão (%d / %d) é: %d", dividendo, divisor, resto);
    }
}
