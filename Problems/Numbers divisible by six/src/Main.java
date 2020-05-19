import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int res = 0;
        int num = scanner.nextInt();
        int ch = 0;
        for (int i = 0; i < num; i++) {
            ch = scanner.nextInt();
            if (ch % 6 == 0) {
                res += ch;
            }
        }

        System.out.println(res);
    }
}