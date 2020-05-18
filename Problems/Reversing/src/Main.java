import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int d1 = digit / 100;
        int d2 = (digit / 10 % 10) * 10;
        int d3 = (digit % 10) * 100;

        System.out.println(d3 + d2 + d1);


    }
}