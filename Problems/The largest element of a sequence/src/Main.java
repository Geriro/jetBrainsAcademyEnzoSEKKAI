import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = num;
        while (num != 0 && scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}