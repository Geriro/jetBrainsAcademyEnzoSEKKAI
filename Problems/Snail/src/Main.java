import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = 0;
        int day = 0;
        while (h > p) {
            p += a;
            if (p < h) {
                p -= b;
            }
            day++;
        }
        System.out.println(day);
    }
}