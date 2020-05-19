import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long res = 1;
        int n = 1;
        while (res <= m) {
            n++;
            res *= n;
        }
        System.out.println(n);
    }
}