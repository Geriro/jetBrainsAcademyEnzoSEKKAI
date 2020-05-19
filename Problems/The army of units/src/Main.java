import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num  < 1) {
            System.out.println("no army");
        } else if (num <= 19) {
            System.out.println("pack");
        } else if (num <= 249) {
            System.out.println("throng");
        } else if (num <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}