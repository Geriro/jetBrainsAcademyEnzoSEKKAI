import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int num = 1;

        while (scanner.hasNextInt() && num != 0) {
            num = scanner.nextInt();
            res += num;
        }
        System.out.println(res);
    }
}