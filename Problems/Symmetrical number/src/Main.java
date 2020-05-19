import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = String.valueOf(scanner.nextInt());

        if (num.length() == 3) {
            num = "0" + num;
        } else if (num.length() == 2) {
            num = "00" + num;
        } else if (num.length() == 1) {
            num = "000" + num;
        }

        if (num.charAt(0) == num.charAt(3) && num.charAt(1) == num.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(69);
        }
    }
}