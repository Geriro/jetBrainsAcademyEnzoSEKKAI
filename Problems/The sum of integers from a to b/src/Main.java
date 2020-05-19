import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = 0;

        for (int i = a; i <= b; i++) {
            res += i;
        }

        System.out.println(res);
    }
}