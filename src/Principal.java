public class Principal {
    private static int contador = 0;

    public static void main(String[] args) {
        recursivo(1);
    }

    public static int recursivo(int num) {
        if (num > 1000) return -1;
        int ordinal = num / 5;

        if (ordinal % 2 == 0) System.out.printf("%s número ordinal.%n", num);

        if (num % 2 == 0) System.out.printf("%s es par%n", num);
        else System.out.printf("%s es primo%n", num);
        return recursivo(num + 1);
    }
}
