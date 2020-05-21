import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int res = 0;
        int num = 0;
        while (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            res += num;

            if (res >= 1000) {
                res = res - 1000;
                break;
            }
        }

        System.out.println(res);
    }
}