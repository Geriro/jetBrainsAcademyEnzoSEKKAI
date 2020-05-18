import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n + 1 + (n + 1) % 2;

        System.out.println(m);

    }
}