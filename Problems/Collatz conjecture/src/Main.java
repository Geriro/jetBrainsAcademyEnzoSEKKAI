import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =  scanner.nextInt();

        while (num != 1) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
        }
        System.out.print(num);
    }
}