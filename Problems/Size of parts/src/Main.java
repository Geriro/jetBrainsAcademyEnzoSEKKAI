import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[3];
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            tab[num + 1] += 1;
        }

        System.out.println(tab[1] + " " + tab[2] + " " + tab[0]);
    }
}