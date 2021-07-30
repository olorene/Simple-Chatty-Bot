import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numHog = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean numNotWeekend = 10 <= numHog && numHog <= 20;
        boolean numWeekend = 15 <= numHog && numHog <= 25;

        boolean answer = numNotWeekend && !weekend || numWeekend && weekend;

        System.out.println(answer);
    }
}