import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int temp = scanner.nextInt();
        boolean res = true;
        while (num == temp) {
            num = temp;
            temp = scanner.nextInt();
            if (temp == 0) {
                break;
            }
        }
        if (num > temp) {
            while (scanner.hasNextInt()) {
                num = temp;
                temp = scanner.nextInt();
                if (temp == 0) {
                    break;
                } else if (num < temp) {
                    res = false;
                    break;
                }
            }
        } else if (num < temp) {
            while (scanner.hasNextInt()) {
                num = temp;
                temp = scanner.nextInt();
                if (temp == 0) {
                    break;
                } else if (num > temp) {
                    res = false;
                    break;
                }
            }
        }

        System.out.println(res);

    }
}
