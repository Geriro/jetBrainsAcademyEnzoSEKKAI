import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}