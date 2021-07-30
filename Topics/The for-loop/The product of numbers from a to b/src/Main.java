import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long product = a;

        for (long i = product + 1; i < b; i++) {
            product = i * product;
        }
        System.out.println(product);
    }
}
