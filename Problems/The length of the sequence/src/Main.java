import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (scanner.nextInt() != 0) {
            res++;
        }
        System.out.println(res);
    }
}