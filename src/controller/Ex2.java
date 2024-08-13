package controller;

public class Ex2 {
    public static int restoDivisao(int dividendo, int divisor) {
        if (divisor > dividendo) {
            return dividendo;
        }
        return restoDivisao(dividendo - divisor, divisor);
    }
}
