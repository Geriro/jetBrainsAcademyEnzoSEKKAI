import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tmp;
        for (int i = 0; i < 3; i++) {
            tmp = scanner.nextInt();
            if (tmp % 2 == 1) {
                sum += tmp / 2 + 1;
            } else {
                sum += tmp / 2;
            }
        }
        System.out.println(sum);
    }
}