import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int night = scanner.nextInt();

        System.out.println(flight * 2 + duration * food + night * (duration - 1));
    }
}