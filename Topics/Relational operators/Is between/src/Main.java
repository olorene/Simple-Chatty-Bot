import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

/*        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }*/

        boolean answer = a >= b && a <= c || a <= b && a >= c;

        System.out.println(answer);
    }
}