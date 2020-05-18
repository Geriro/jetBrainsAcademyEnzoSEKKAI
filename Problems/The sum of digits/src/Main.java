import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int d1 = digit / 100;
        int d2 = digit / 10 % 10;
        int d3 = digit % 10;

        System.out.println(d1 + d2 + d3);
    }
}