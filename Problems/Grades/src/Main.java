import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int n = scanner.nextInt();
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num == 5) {
                a++;
            } else if (num == 4) {
                b++;
            } else if (num == 3) {
                c++;
            } else if (num == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}

/*
int size = scanner.nextInt();

        int[] grades = new int[5];

        for (int i = 0; i < size; i++) {
            int grade = scanner.nextInt();
            grades[grade - 1]++;
        }

 */